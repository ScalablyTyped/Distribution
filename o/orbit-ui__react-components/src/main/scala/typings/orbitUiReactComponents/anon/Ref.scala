package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends StObject {
  
  var id: String = js.native
  
  var onKeyDown: Unit = js.native
  def onKeyDown(event: KeyboardEvent[Element]): Unit = js.native
  
  var ref: MergedRef[HTMLElement] = js.native
  
  var show: Boolean = js.native
}
