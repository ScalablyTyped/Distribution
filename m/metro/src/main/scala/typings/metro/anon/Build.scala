package typings.metro.anon

import typings.metro.srcServerMod.default
import typings.metro.srcSharedTypesMod.OutputOptions
import typings.metro.srcSharedTypesMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  def build(server: default, options: RequestOptions): js.Promise[Map]
  
  def save(entry: Map, options: OutputOptions, postSave: js.Function1[/* repeated */ String, Unit]): js.Promise[Any]
}
object Build {
  
  inline def apply(
    build: (default, RequestOptions) => js.Promise[Map],
    save: (Map, OutputOptions, js.Function1[/* repeated */ String, Unit]) => js.Promise[Any]
  ): Build = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction2(build), save = js.Any.fromFunction3(save))
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: (default, RequestOptions) => js.Promise[Map]): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
    
    inline def setSave(value: (Map, OutputOptions, js.Function1[/* repeated */ String, Unit]) => js.Promise[Any]): Self = StObject.set(x, "save", js.Any.fromFunction3(value))
  }
}
