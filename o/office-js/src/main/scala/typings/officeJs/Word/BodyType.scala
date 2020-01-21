package typings.officeJs.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BodyType with String] = js.native
  /* "Footer" */ @js.native
  object footer extends TopLevel[footer with String]
  
  /* "Header" */ @js.native
  object header extends TopLevel[header with String]
  
  /* "MainDoc" */ @js.native
  object mainDoc extends TopLevel[mainDoc with String]
  
  /* "Section" */ @js.native
  object section extends TopLevel[section with String]
  
  /* "TableCell" */ @js.native
  object tableCell extends TopLevel[tableCell with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

