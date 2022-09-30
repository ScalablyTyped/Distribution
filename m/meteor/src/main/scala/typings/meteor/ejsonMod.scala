package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.anon.Canonical
import typings.meteor.anon.KeyOrderSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ejsonMod {
  
  object EJSON {
    
    @JSImport("meteor/ejson", "EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addType(
      name: String,
      factory: js.Function1[
          /* val */ typings.meteor.ejsonMod.JSONable, 
          typings.meteor.ejsonMod.EJSONableCustomType
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def equals_(a: typings.meteor.ejsonMod.EJSON, b: typings.meteor.ejsonMod.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(a: typings.meteor.ejsonMod.EJSON, b: typings.meteor.ejsonMod.EJSON, options: KeyOrderSensitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromJSONValue(`val`: typings.meteor.ejsonMod.JSONable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isBinary(x: js.Object): /* is std.Uint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8Array */ Boolean]
    
    inline def newBinary(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("newBinary")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def parse(str: String): typings.meteor.ejsonMod.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.ejsonMod.EJSON]
    
    inline def stringify(`val`: typings.meteor.ejsonMod.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(`val`: typings.meteor.ejsonMod.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toJSONValue(`val`: typings.meteor.ejsonMod.EJSON): typings.meteor.ejsonMod.JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.ejsonMod.JSONable]
  }
  type EJSON = typings.meteor.ejsonMod.EJSONable
  
  type EJSONable = StringDictionary[typings.meteor.ejsonMod.EJSONableProperty]
  
  trait EJSONableCustomType extends StObject {
    
    @JSName("clone")
    var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    @JSName("equals")
    var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.undefined
    
    def toJSONValue(): typings.meteor.ejsonMod.JSONable
    
    def typeName(): String
  }
  object EJSONableCustomType {
    
    inline def apply(toJSONValue: () => typings.meteor.ejsonMod.JSONable, typeName: () => String): typings.meteor.ejsonMod.EJSONableCustomType = {
      val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
      __obj.asInstanceOf[typings.meteor.ejsonMod.EJSONableCustomType]
    }
    
    extension [Self <: typings.meteor.ejsonMod.EJSONableCustomType](x: Self) {
      
      inline def setClone_(value: () => typings.meteor.ejsonMod.EJSONableCustomType): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setEquals_(value: /* other */ js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setToJSONValue(value: () => typings.meteor.ejsonMod.JSONable): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
      
      inline def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
    }
  }
  
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | js.typedarray.Uint8Array | typings.meteor.ejsonMod.EJSONableCustomType | Null
  ]
  
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
}
