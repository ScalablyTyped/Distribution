package typings.mu2

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mu2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  inline def clearCache(templateName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(templateName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def compile(filename: String, callback: js.Function2[/* err */ js.Error, /* parsed */ IParsed, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compileAndRender(templateName: String, view: Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("compileAndRender")(templateName.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def compileText(name: String, template: String): IParsed = (^.asInstanceOf[js.Dynamic].applyDynamic("compileText")(name.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[IParsed]
  inline def compileText(
    name: String,
    template: String,
    callback: js.Function2[/* err */ js.Error, /* parsed */ IParsed, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compileText")(name.asInstanceOf[js.Any], template.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compileText(template: String): IParsed = ^.asInstanceOf[js.Dynamic].applyDynamic("compileText")(template.asInstanceOf[js.Any]).asInstanceOf[IParsed]
  
  inline def render(filenameOrParsed: String, view: Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(filenameOrParsed.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def render(filenameOrParsed: IParsed, view: Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(filenameOrParsed.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def renderText(template: String, view: Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def renderText(template: String, view: Any, partials: Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  @JSImport("mu2", "root")
  @js.native
  def root: String = js.native
  inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  
  trait IParsed extends StObject
}
