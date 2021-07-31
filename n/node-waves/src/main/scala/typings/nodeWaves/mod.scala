package typings.nodeWaves

import typings.nodeWaves.anon.Delay
import typings.nodeWaves.anon.Position
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-waves", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attach(elements: ElementSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def attach(elements: ElementSelector, classes: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(elements.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def attach(elements: ElementSelector, classes: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(elements.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def calm(elements: ElementSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("calm")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  @scala.inline
  def init(config: Delay): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def ripple(elements: ElementSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ripple")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def ripple(elements: ElementSelector, option: Position): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ripple")(elements.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ElementSelector = String | HTMLElement | js.Array[HTMLElement]
}
