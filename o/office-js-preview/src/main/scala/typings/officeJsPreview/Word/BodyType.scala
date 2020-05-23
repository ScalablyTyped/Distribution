package typings.officeJsPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BodyType extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.BodyType")
@js.native
object BodyType extends js.Object {
  @js.native
  sealed trait footer extends BodyType
  
  @js.native
  sealed trait header extends BodyType
  
  @js.native
  sealed trait mainDoc extends BodyType
  
  @js.native
  sealed trait section extends BodyType
  
  @js.native
  sealed trait tableCell extends BodyType
  
  @js.native
  sealed trait unknown extends BodyType
  
}

