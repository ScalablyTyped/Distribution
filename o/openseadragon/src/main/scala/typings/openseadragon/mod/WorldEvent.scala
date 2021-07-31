package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldEvent
  extends StObject
     with OSDEvent[World] {
  
  var item: js.UndefOr[TiledImage] = js.native
  
  var newIndex: js.UndefOr[Double] = js.native
  
  var previousIndex: js.UndefOr[Double] = js.native
}
