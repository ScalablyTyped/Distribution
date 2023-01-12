package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namer[ConfigType] extends StObject {
  
  var loadConfig: js.UndefOr[
    js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, js.Promise[ConfigType] | ConfigType]
  ] = js.undefined
  
  /** Return a filename/-path for <code>bundle</code> or nullish to leave it to the next namer plugin. */
  def name(arg0: typings.parcelTypes.anon.Bundle[ConfigType]): Async[js.UndefOr[FilePath | Null]]
}
object Namer {
  
  inline def apply[ConfigType](name: typings.parcelTypes.anon.Bundle[ConfigType] => Async[js.UndefOr[FilePath | Null]]): Namer[ConfigType] = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[Namer[ConfigType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Namer[?], ConfigType] (val x: Self & Namer[ConfigType]) extends AnyVal {
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setName(value: typings.parcelTypes.anon.Bundle[ConfigType] => Async[js.UndefOr[FilePath | Null]]): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
  }
}
