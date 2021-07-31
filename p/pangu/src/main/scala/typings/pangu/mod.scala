package typings.pangu

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pangu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def spacing(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spacing")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def spacingElementByClassName(className: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingElementByClassName")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spacingElementById(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingElementById")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spacingElementByTagName(tagName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingElementByTagName")(tagName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spacingFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def spacingFile(path: String, callback: js.Function2[/* error */ Error, /* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spacingFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def spacingFileSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def spacingPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingPage")().asInstanceOf[Unit]
  
  @scala.inline
  def spacingText(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def spacingText(text: String, callback: js.Function2[/* error */ Error, /* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spacingText")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
