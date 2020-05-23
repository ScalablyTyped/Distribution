package typings.officeJsPreview.Word

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
  
}

