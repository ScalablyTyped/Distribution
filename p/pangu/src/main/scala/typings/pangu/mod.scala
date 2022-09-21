package typings.pangu

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pangu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoSpacingPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")().asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Double, nodeDelay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any], nodeDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Double, nodeDelay: Double, nodeMaxWait: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any], nodeDelay.asInstanceOf[js.Any], nodeMaxWait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Double, nodeDelay: Unit, nodeMaxWait: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any], nodeDelay.asInstanceOf[js.Any], nodeMaxWait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Unit, nodeDelay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any], nodeDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Unit, nodeDelay: Double, nodeMaxWait: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any], nodeDelay.asInstanceOf[js.Any], nodeMaxWait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autoSpacingPage(pageDelay: Unit, nodeDelay: Unit, nodeMaxWait: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoSpacingPage")(pageDelay.asInstanceOf[js.Any], nodeDelay.asInstanceOf[js.Any], nodeMaxWait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def spacing(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spacing")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def spacingElementByClassName(className: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingElementByClassName")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spacingElementById(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingElementById")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spacingElementByTagName(tagName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingElementByTagName")(tagName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spacingFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spacingFile(path: String, callback: js.Function2[/* error */ js.Error, /* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spacingFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def spacingFileSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def spacingNode(contextNode: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingNode")(contextNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spacingPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingPage")().asInstanceOf[Unit]
  
  inline def spacingPageBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingPageBody")().asInstanceOf[Unit]
  
  inline def spacingPageTitle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingPageTitle")().asInstanceOf[Unit]
  
  inline def spacingText(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spacingText(text: String, callback: js.Function2[/* error */ js.Error, /* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spacingText")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
