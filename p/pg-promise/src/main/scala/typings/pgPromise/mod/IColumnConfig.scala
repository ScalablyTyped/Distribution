package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnConfig[T] extends StObject {
  
  var cast: js.UndefOr[String] = js.undefined
  
  var cnd: js.UndefOr[Boolean] = js.undefined
  
  var `def`: js.UndefOr[Any] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* col */ IColumnDescriptor[T], Any]] = js.undefined
  
  var mod: js.UndefOr[FormattingFilter] = js.undefined
  
  var name: String
  
  var prop: js.UndefOr[String] = js.undefined
  
  var skip: js.UndefOr[js.Function1[/* col */ IColumnDescriptor[T], Boolean]] = js.undefined
}
object IColumnConfig {
  
  inline def apply[T](name: String): IColumnConfig[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnConfig[T]]
  }
  
  extension [Self <: IColumnConfig[?], T](x: Self & IColumnConfig[T]) {
    
    inline def setCast(value: String): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    inline def setCnd(value: Boolean): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    inline def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    inline def setDef(value: Any): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    inline def setInit(value: /* col */ IColumnDescriptor[T] => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setMod(value: FormattingFilter): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    
    inline def setSkip(value: /* col */ IColumnDescriptor[T] => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
