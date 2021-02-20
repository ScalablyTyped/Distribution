package typings.mssql

import typings.mssql.mod.ISqlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CaseSensitive extends StObject {
    
    var caseSensitive: Boolean = js.native
    
    var identity: Boolean = js.native
    
    var index: Double = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var nullable: Boolean = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var readOnly: Boolean = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var `type`: js.Function0[ISqlType] | ISqlType = js.native
    
    var udt: js.UndefOr[js.Any] = js.native
  }
  object CaseSensitive {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CaseSensitiveMutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setType(value: js.Function0[ISqlType] | ISqlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction0(value: () => ISqlType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUdt(value: js.Any): Self = StObject.set(x, "udt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUdtUndefined: Self = StObject.set(x, "udt", js.undefined)
    }
  }
  
  @js.native
  trait Io extends StObject {
    
    var io: Double = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var precision: Double = js.native
    
    var scale: Double = js.native
    
    var tvpType: js.Any = js.native
    
    var `type`: js.Function0[ISqlType] | ISqlType = js.native
    
    var value: js.Any = js.native
  }
  object Io {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IoMutableBuilder[Self <: Io] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIo(value: Double): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvpType(value: js.Any): Self = StObject.set(x, "tvpType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Function0[ISqlType] | ISqlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction0(value: () => ISqlType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Js extends StObject {
    
    @JSName("js")
    var js_ : js.Any = js.native
    
    var sql: js.Any = js.native
  }
  object Js {
    
    @scala.inline
    def apply(js_ : js.Any, sql: js.Any): Js = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Js]
    }
    
    @scala.inline
    implicit class JsMutableBuilder[Self <: Js] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJs_(value: js.Any): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSql(value: js.Any): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
}
