package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.distSrcJsonMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    var cwd: String
    
    var fileName: String
  }
  object Cwd {
    
    inline def apply(cwd: String, fileName: String): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Domain extends StObject {
    
    var domain: String
    
    var hash: String
    
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var pathname: String
    
    var protocol: String
    
    var search: String
  }
  object Domain {
    
    inline def apply(domain: String, hash: String, pathname: String, protocol: String, search: String): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoreArrayElements extends StObject {
    
    var ignoreArrayElements: js.UndefOr[Boolean] = js.undefined
    
    var leafsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreArrayElements {
    
    inline def apply(): IgnoreArrayElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreArrayElements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreArrayElements] (val x: Self) extends AnyVal {
      
      inline def setIgnoreArrayElements(value: Boolean): Self = StObject.set(x, "ignoreArrayElements", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArrayElementsUndefined: Self = StObject.set(x, "ignoreArrayElements", js.undefined)
      
      inline def setLeafsOnly(value: Boolean): Self = StObject.set(x, "leafsOnly", value.asInstanceOf[js.Any])
      
      inline def setLeafsOnlyUndefined: Self = StObject.set(x, "leafsOnly", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: Any
  }
  object Key {
    
    inline def apply(key: String, value: Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyValue[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */] extends StObject {
    
    var key: /* keyof O */ String
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
  }
  object KeyValue {
    
    inline def apply[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */](
      key: /* keyof O */ String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ): KeyValue[O] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyValue[O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyValue[?], O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */] (val x: Self & KeyValue[O]) extends AnyVal {
      
      inline def setKey(value: /* keyof O */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Leading extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object Leading {
    
    inline def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  trait Minutes extends StObject {
    
    var minutes: js.UndefOr[Boolean] = js.undefined
    
    var ms: js.UndefOr[Boolean] = js.undefined
    
    var seconds: js.UndefOr[Boolean] = js.undefined
  }
  object Minutes {
    
    inline def apply(): Minutes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Minutes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Minutes] (val x: Self) extends AnyVal {
      
      inline def setMinutes(value: Boolean): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setMs(value: Boolean): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setSeconds(value: Boolean): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var value: String
  }
  object Name {
    
    inline def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: js.Array[Any]
    
    var sql: String
  }
  object Params {
    
    inline def apply(params: js.Array[Any], sql: String): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseBoolean extends StObject {
    
    var parseBoolean: js.UndefOr[Boolean] = js.undefined
    
    var parseNumber: js.UndefOr[Boolean] = js.undefined
  }
  object ParseBoolean {
    
    inline def apply(): ParseBoolean = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseBoolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseBoolean] (val x: Self) extends AnyVal {
      
      inline def setParseBoolean(value: Boolean): Self = StObject.set(x, "parseBoolean", value.asInstanceOf[js.Any])
      
      inline def setParseBooleanUndefined: Self = StObject.set(x, "parseBoolean", js.undefined)
      
      inline def setParseNumber(value: Boolean): Self = StObject.set(x, "parseNumber", value.asInstanceOf[js.Any])
      
      inline def setParseNumberUndefined: Self = StObject.set(x, "parseNumber", js.undefined)
    }
  }
  
  trait ParseParams extends StObject {
    
    var parseParams: js.UndefOr[Boolean] = js.undefined
  }
  object ParseParams {
    
    inline def apply(): ParseParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseParams] (val x: Self) extends AnyVal {
      
      inline def setParseParams(value: Boolean): Self = StObject.set(x, "parseParams", value.asInstanceOf[js.Any])
      
      inline def setParseParamsUndefined: Self = StObject.set(x, "parseParams", js.undefined)
    }
  }
  
  trait Pos extends StObject {
    
    var pos: Double
    
    var toAdd: js.UndefOr[String] = js.undefined
    
    var toRemove: js.UndefOr[String] = js.undefined
  }
  object Pos {
    
    inline def apply(pos: Double): Pos = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setToAdd(value: String): Self = StObject.set(x, "toAdd", value.asInstanceOf[js.Any])
      
      inline def setToAddUndefined: Self = StObject.set(x, "toAdd", js.undefined)
      
      inline def setToRemove(value: String): Self = StObject.set(x, "toRemove", value.asInstanceOf[js.Any])
      
      inline def setToRemoveUndefined: Self = StObject.set(x, "toRemove", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var key: String | Double
    
    var value: JSONValue
  }
  object Value {
    
    inline def apply(key: String | Double): Value = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: JSONValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
