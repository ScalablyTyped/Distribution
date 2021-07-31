package typings.mu2

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mu2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  @scala.inline
  def clearCache(templateName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(templateName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def compile(filename: String, callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def compileAndRender(templateName: String, view: js.Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("compileAndRender")(templateName.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  @scala.inline
  def compileText(name: String, template: String): IParsed = (^.asInstanceOf[js.Dynamic].applyDynamic("compileText")(name.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[IParsed]
  @scala.inline
  def compileText(
    name: String,
    template: String,
    callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compileText")(name.asInstanceOf[js.Any], template.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compileText(template: String): IParsed = ^.asInstanceOf[js.Dynamic].applyDynamic("compileText")(template.asInstanceOf[js.Any]).asInstanceOf[IParsed]
  
  @scala.inline
  def render(filenameOrParsed: String, view: js.Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(filenameOrParsed.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  @scala.inline
  def render(filenameOrParsed: IParsed, view: js.Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(filenameOrParsed.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  @scala.inline
  def renderText(template: String, view: js.Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  @scala.inline
  def renderText(template: String, view: js.Any, partials: js.Any): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  @JSImport("mu2", "root")
  @js.native
  def root: String = js.native
  @scala.inline
  def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  
  trait IParsed extends StObject
}
