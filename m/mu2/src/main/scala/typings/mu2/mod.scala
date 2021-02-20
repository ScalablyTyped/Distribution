package typings.mu2

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mu2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mu2", "clearCache")
  @js.native
  def clearCache(): Unit = js.native
  @JSImport("mu2", "clearCache")
  @js.native
  def clearCache(templateName: String): Unit = js.native
  
  @JSImport("mu2", "compile")
  @js.native
  def compile(filename: String, callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]): Unit = js.native
  
  @JSImport("mu2", "compileAndRender")
  @js.native
  def compileAndRender(templateName: String, view: js.Any): ReadableStream = js.native
  
  @JSImport("mu2", "compileText")
  @js.native
  def compileText(name: String, template: String): IParsed = js.native
  @JSImport("mu2", "compileText")
  @js.native
  def compileText(
    name: String,
    template: String,
    callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]
  ): Unit = js.native
  @JSImport("mu2", "compileText")
  @js.native
  def compileText(template: String): IParsed = js.native
  
  @JSImport("mu2", "render")
  @js.native
  def render(filenameOrParsed: String, view: js.Any): ReadableStream = js.native
  @JSImport("mu2", "render")
  @js.native
  def render(filenameOrParsed: IParsed, view: js.Any): ReadableStream = js.native
  
  @JSImport("mu2", "renderText")
  @js.native
  def renderText(template: String, view: js.Any): ReadableStream = js.native
  @JSImport("mu2", "renderText")
  @js.native
  def renderText(template: String, view: js.Any, partials: js.Any): ReadableStream = js.native
  
  @JSImport("mu2", "root")
  @js.native
  def root: String = js.native
  @scala.inline
  def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  
  @js.native
  trait IParsed extends StObject
}
