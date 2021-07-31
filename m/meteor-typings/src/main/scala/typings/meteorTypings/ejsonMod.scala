package typings.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import typings.meteorTypings.anon.Canonical
import typings.meteorTypings.anon.KeyOrderSensitive
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ejsonMod {
  
  object EJSON {
    
    @JSImport("meteor/ejson", "EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addType(
      name: String,
      factory: js.Function1[
          /* val */ typings.meteorTypings.ejsonMod.JSONable, 
          typings.meteorTypings.ejsonMod.EJSONableCustomType
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def equals_(a: typings.meteorTypings.ejsonMod.EJSON, b: typings.meteorTypings.ejsonMod.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def equals_(
      a: typings.meteorTypings.ejsonMod.EJSON,
      b: typings.meteorTypings.ejsonMod.EJSON,
      options: KeyOrderSensitive
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def fromJSONValue(`val`: typings.meteorTypings.ejsonMod.JSONable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def isBinary(x: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("meteor/ejson", "EJSON.newBinary")
    @js.native
    def newBinary: js.Any = js.native
    @scala.inline
    def newBinary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def parse(str: String): typings.meteorTypings.ejsonMod.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.meteorTypings.ejsonMod.EJSON]
    
    @scala.inline
    def stringify(`val`: typings.meteorTypings.ejsonMod.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def stringify(`val`: typings.meteorTypings.ejsonMod.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def toJSONValue(`val`: typings.meteorTypings.ejsonMod.EJSON): typings.meteorTypings.ejsonMod.JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.meteorTypings.ejsonMod.JSONable]
  }
  type EJSON = typings.meteorTypings.ejsonMod.EJSONable
  
  type EJSONable = StringDictionary[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Date | Uint8Array | typings.meteorTypings.ejsonMod.EJSONableCustomType
  ]
  
  trait EJSONableCustomType extends StObject {
    
    def equals(other: js.Object): Boolean
    
    def toJSONValue(): typings.meteorTypings.ejsonMod.JSONable
    
    def typeName(): String
  }
  object EJSONableCustomType {
    
    @scala.inline
    def apply(
      equals_ : js.Object => Boolean,
      toJSONValue: () => typings.meteorTypings.ejsonMod.JSONable,
      typeName: () => String
    ): typings.meteorTypings.ejsonMod.EJSONableCustomType = {
      val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.meteorTypings.ejsonMod.EJSONableCustomType]
    }
    
    @scala.inline
    implicit class EJSONableCustomTypeMutableBuilder[Self <: typings.meteorTypings.ejsonMod.EJSONableCustomType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSONValue(value: () => typings.meteorTypings.ejsonMod.JSONable): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
    }
  }
  
  type JSONable = StringDictionary[Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String])]
}
