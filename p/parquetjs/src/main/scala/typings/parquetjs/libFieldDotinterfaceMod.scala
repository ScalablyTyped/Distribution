package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldDotinterfaceMod {
  
  trait FieldInterface extends StObject {
    
    var compression: js.UndefOr[String] = js.undefined
    
    var dLevelMax: Double
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fieldCount: js.UndefOr[Double] = js.undefined
    
    var fields: js.UndefOr[StringDictionary[FieldInterface]] = js.undefined
    
    var isNested: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var originalType: js.UndefOr[String | Null] = js.undefined
    
    var path: js.Array[String]
    
    var primitiveType: js.UndefOr[String | Null] = js.undefined
    
    var rLevelMax: Double
    
    var repetitionType: String
    
    var typeLength: js.UndefOr[Double | Null] = js.undefined
  }
  object FieldInterface {
    
    inline def apply(dLevelMax: Double, name: String, path: js.Array[String], rLevelMax: Double, repetitionType: String): FieldInterface = {
      val __obj = js.Dynamic.literal(dLevelMax = dLevelMax.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rLevelMax = rLevelMax.asInstanceOf[js.Any], repetitionType = repetitionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInterface]
    }
    
    extension [Self <: FieldInterface](x: Self) {
      
      inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDLevelMax(value: Double): Self = StObject.set(x, "dLevelMax", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      inline def setFieldCountUndefined: Self = StObject.set(x, "fieldCount", js.undefined)
      
      inline def setFields(value: StringDictionary[FieldInterface]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setIsNested(value: Boolean): Self = StObject.set(x, "isNested", value.asInstanceOf[js.Any])
      
      inline def setIsNestedUndefined: Self = StObject.set(x, "isNested", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginalType(value: String): Self = StObject.set(x, "originalType", value.asInstanceOf[js.Any])
      
      inline def setOriginalTypeNull: Self = StObject.set(x, "originalType", null)
      
      inline def setOriginalTypeUndefined: Self = StObject.set(x, "originalType", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPrimitiveType(value: String): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveTypeNull: Self = StObject.set(x, "primitiveType", null)
      
      inline def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
      
      inline def setRLevelMax(value: Double): Self = StObject.set(x, "rLevelMax", value.asInstanceOf[js.Any])
      
      inline def setRepetitionType(value: String): Self = StObject.set(x, "repetitionType", value.asInstanceOf[js.Any])
      
      inline def setTypeLength(value: Double): Self = StObject.set(x, "typeLength", value.asInstanceOf[js.Any])
      
      inline def setTypeLengthNull: Self = StObject.set(x, "typeLength", null)
      
      inline def setTypeLengthUndefined: Self = StObject.set(x, "typeLength", js.undefined)
    }
  }
}
