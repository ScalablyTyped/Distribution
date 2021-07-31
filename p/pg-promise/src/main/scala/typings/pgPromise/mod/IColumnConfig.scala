package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnConfig[S] extends StObject {
  
  var cast: js.UndefOr[String] = js.undefined
  
  var cnd: js.UndefOr[Boolean] = js.undefined
  
  var `def`: js.UndefOr[js.Any] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* col */ IColumnDescriptor[S], js.Any]] = js.undefined
  
  var mod: js.UndefOr[FormattingFilter] = js.undefined
  
  var name: String
  
  var prop: js.UndefOr[String] = js.undefined
  
  var skip: js.UndefOr[js.Function1[/* col */ IColumnDescriptor[S], Boolean]] = js.undefined
}
object IColumnConfig {
  
  @scala.inline
  def apply[S](name: String): IColumnConfig[S] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnConfig[S]]
  }
  
  @scala.inline
  implicit class IColumnConfigMutableBuilder[Self <: IColumnConfig[?], S] (val x: Self & IColumnConfig[S]) extends AnyVal {
    
    @scala.inline
    def setCast(value: String): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    @scala.inline
    def setCnd(value: Boolean): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    @scala.inline
    def setDef(value: js.Any): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    @scala.inline
    def setInit(value: /* col */ IColumnDescriptor[S] => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setMod(value: FormattingFilter): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    
    @scala.inline
    def setSkip(value: /* col */ IColumnDescriptor[S] => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
