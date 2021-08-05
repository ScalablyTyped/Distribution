package typings.mssql

import typings.mssql.mod.ISqlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CaseSensitive extends StObject {
    
    var caseSensitive: Boolean
    
    var identity: Boolean
    
    var index: Double
    
    var length: Double
    
    var name: String
    
    var nullable: Boolean
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var readOnly: Boolean
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var `type`: js.Function0[ISqlType] | ISqlType
    
    var udt: js.UndefOr[js.Any] = js.undefined
  }
  object CaseSensitive {
    
    inline def apply(
      caseSensitive: Boolean,
      identity: Boolean,
      index: Double,
      length: Double,
      name: String,
      nullable: Boolean,
      readOnly: Boolean,
      `type`: js.Function0[ISqlType] | ISqlType
    ): CaseSensitive = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaseSensitive]
    }
    
    extension [Self <: CaseSensitive](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setType(value: js.Function0[ISqlType] | ISqlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction0(value: () => ISqlType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      inline def setUdt(value: js.Any): Self = StObject.set(x, "udt", value.asInstanceOf[js.Any])
      
      inline def setUdtUndefined: Self = StObject.set(x, "udt", js.undefined)
    }
  }
  
  trait Io extends StObject {
    
    var io: Double
    
    var length: Double
    
    var name: String
    
    var precision: Double
    
    var scale: Double
    
    var tvpType: js.Any
    
    var `type`: js.Function0[ISqlType] | ISqlType
    
    var value: js.Any
  }
  object Io {
    
    inline def apply(
      io: Double,
      length: Double,
      name: String,
      precision: Double,
      scale: Double,
      tvpType: js.Any,
      `type`: js.Function0[ISqlType] | ISqlType,
      value: js.Any
    ): Io = {
      val __obj = js.Dynamic.literal(io = io.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tvpType = tvpType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Io]
    }
    
    extension [Self <: Io](x: Self) {
      
      inline def setIo(value: Double): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTvpType(value: js.Any): Self = StObject.set(x, "tvpType", value.asInstanceOf[js.Any])
      
      inline def setType(value: js.Function0[ISqlType] | ISqlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction0(value: () => ISqlType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Js extends StObject {
    
    @JSName("js")
    var js_ : js.Any
    
    var sql: js.Any
  }
  object Js {
    
    inline def apply(js_ : js.Any, sql: js.Any): Js = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Js]
    }
    
    extension [Self <: Js](x: Self) {
      
      inline def setJs_(value: js.Any): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setSql(value: js.Any): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
}
