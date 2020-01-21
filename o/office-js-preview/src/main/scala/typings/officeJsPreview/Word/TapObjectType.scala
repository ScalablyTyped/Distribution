package typings.officeJsPreview.Word

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TapObjectType extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.TapObjectType")
@js.native
object TapObjectType extends js.Object {
  @js.native
  sealed trait chart extends TapObjectType
  
  @js.native
  sealed trait image extends TapObjectType
  
  @js.native
  sealed trait ole extends TapObjectType
  
  @js.native
  sealed trait slide extends TapObjectType
  
  @js.native
  sealed trait smartArt extends TapObjectType
  
  @js.native
  sealed trait table extends TapObjectType
  
  @js.native
  sealed trait text extends TapObjectType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TapObjectType with String] = js.native
  /* "Chart" */ @js.native
  object chart extends TopLevel[chart with String]
  
  /* "Image" */ @js.native
  object image extends TopLevel[image with String]
  
  /* "OLE" */ @js.native
  object ole extends TopLevel[ole with String]
  
  /* "Slide" */ @js.native
  object slide extends TopLevel[slide with String]
  
  /* "SmartArt" */ @js.native
  object smartArt extends TopLevel[smartArt with String]
  
  /* "Table" */ @js.native
  object table extends TopLevel[table with String]
  
  /* "Text" */ @js.native
  object text extends TopLevel[text with String]
  
}

