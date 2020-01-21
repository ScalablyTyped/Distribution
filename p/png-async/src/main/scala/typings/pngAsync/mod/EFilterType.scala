package typings.pngAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFilterType extends js.Object

@JSImport("png-async", "EFilterType")
@js.native
object EFilterType extends js.Object {
  @js.native
  sealed trait Auto extends EFilterType
  
  @js.native
  sealed trait Average extends EFilterType
  
  @js.native
  sealed trait None extends EFilterType
  
  @js.native
  sealed trait Paeth extends EFilterType
  
  @js.native
  sealed trait Sub extends EFilterType
  
  @js.native
  sealed trait Up extends EFilterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFilterType with Double] = js.native
  /* -1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 3 */ @js.native
  object Average extends TopLevel[Average with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Paeth extends TopLevel[Paeth with Double]
  
  /* 1 */ @js.native
  object Sub extends TopLevel[Sub with Double]
  
  /* 2 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

