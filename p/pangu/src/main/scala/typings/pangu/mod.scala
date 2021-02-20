package typings.pangu

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pangu", "spacing")
  @js.native
  def spacing(text: String): String = js.native
  
  @JSImport("pangu", "spacingElementByClassName")
  @js.native
  def spacingElementByClassName(className: String): Unit = js.native
  
  @JSImport("pangu", "spacingElementById")
  @js.native
  def spacingElementById(id: String): Unit = js.native
  
  @JSImport("pangu", "spacingElementByTagName")
  @js.native
  def spacingElementByTagName(tagName: String): Unit = js.native
  
  @JSImport("pangu", "spacingFile")
  @js.native
  def spacingFile(path: String): js.Promise[String] = js.native
  @JSImport("pangu", "spacingFile")
  @js.native
  def spacingFile(path: String, callback: js.Function2[/* error */ Error, /* data */ String, Unit]): Unit = js.native
  
  @JSImport("pangu", "spacingFileSync")
  @js.native
  def spacingFileSync(path: String): String = js.native
  
  @JSImport("pangu", "spacingPage")
  @js.native
  def spacingPage(): Unit = js.native
  
  @JSImport("pangu", "spacingText")
  @js.native
  def spacingText(text: String): js.Promise[String] = js.native
  @JSImport("pangu", "spacingText")
  @js.native
  def spacingText(text: String, callback: js.Function2[/* error */ Error, /* data */ String, Unit]): Unit = js.native
}
