package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Either bounding box, or tags, or hidden.
  *
  * [Api set: WordApi]
  * @remarks
  */
@JSGlobal("Word.ContentControlAppearance")
@js.native
object ContentControlAppearance extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.ContentControlAppearance & String] = js.native
  
  /* "BoundingBox" */ val boundingBox: typings.officeJsPreview.Word.ContentControlAppearance.boundingBox & String = js.native
  
  /* "Hidden" */ val hidden: typings.officeJsPreview.Word.ContentControlAppearance.hidden & String = js.native
  
  /* "Tags" */ val tags: typings.officeJsPreview.Word.ContentControlAppearance.tags & String = js.native
}
