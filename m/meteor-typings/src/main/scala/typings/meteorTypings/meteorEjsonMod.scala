package typings.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import typings.meteorTypings.anon.Canonical
import typings.meteorTypings.anon.KeyOrderSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorEjsonMod {
  
  object EJSON {
    
    @JSImport("meteor/ejson", "EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addType(
      name: String,
      factory: js.Function1[
          /* val */ typings.meteorTypings.meteorEjsonMod.JSONable, 
          typings.meteorTypings.meteorEjsonMod.EJSONableCustomType
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def equals_(a: typings.meteorTypings.meteorEjsonMod.EJSON, b: typings.meteorTypings.meteorEjsonMod.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(
      a: typings.meteorTypings.meteorEjsonMod.EJSON,
      b: typings.meteorTypings.meteorEjsonMod.EJSON,
      options: KeyOrderSensitive
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromJSONValue(`val`: typings.meteorTypings.meteorEjsonMod.JSONable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isBinary(x: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("meteor/ejson", "EJSON.newBinary")
    @js.native
    def newBinary: Any = js.native
    inline def newBinary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newBinary")(x.asInstanceOf[js.Any])
    
    inline def parse(str: String): typings.meteorTypings.meteorEjsonMod.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.meteorTypings.meteorEjsonMod.EJSON]
    
    inline def stringify(`val`: typings.meteorTypings.meteorEjsonMod.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(`val`: typings.meteorTypings.meteorEjsonMod.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toJSONValue(`val`: typings.meteorTypings.meteorEjsonMod.EJSON): typings.meteorTypings.meteorEjsonMod.JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.meteorTypings.meteorEjsonMod.JSONable]
  }
  type EJSON = typings.meteorTypings.meteorEjsonMod.EJSONable
  
  type EJSONable = StringDictionary[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | js.typedarray.Uint8Array | typings.meteorTypings.meteorEjsonMod.EJSONableCustomType
  ]
  
  trait EJSONableCustomType extends StObject {
    
    def equals(other: js.Object): Boolean
    
    def toJSONValue(): typings.meteorTypings.meteorEjsonMod.JSONable
    
    def typeName(): String
  }
  object EJSONableCustomType {
    
    inline def apply(
      equals_ : js.Object => Boolean,
      toJSONValue: () => typings.meteorTypings.meteorEjsonMod.JSONable,
      typeName: () => String
    ): typings.meteorTypings.meteorEjsonMod.EJSONableCustomType = {
      val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typings.meteorTypings.meteorEjsonMod.EJSONableCustomType]
    }
    
    extension [Self <: typings.meteorTypings.meteorEjsonMod.EJSONableCustomType](x: Self) {
      
      inline def setEquals_(value: js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setToJSONValue(value: () => typings.meteorTypings.meteorEjsonMod.JSONable): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
      
      inline def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
    }
  }
  
  type JSONable = StringDictionary[Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String])]
}
