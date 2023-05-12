package typings.mdastCommentMarker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-comment-marker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commentMarker(value: Any): typings.mdastCommentMarker.libMod.Marker | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("commentMarker")(value.asInstanceOf[js.Any]).asInstanceOf[typings.mdastCommentMarker.libMod.Marker | Null]
  
  type Marker = typings.mdastCommentMarker.libMod.Marker
  
  type MarkerParameterValue = typings.mdastCommentMarker.libMod.MarkerParameterValue
  
  type MarkerParameters = typings.mdastCommentMarker.libMod.MarkerParameters
}
