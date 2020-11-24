package typings.pngAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFilterType extends js.Object
@JSImport("png-async", "EFilterType")
@js.native
object EFilterType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFilterType with Double] = js.native
  
  @js.native
  sealed trait Auto extends EFilterType
  /* -1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  @js.native
  sealed trait Average extends EFilterType
  /* 3 */ @js.native
  object Average extends TopLevel[Average with Double]
  
  @js.native
  sealed trait None extends EFilterType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Paeth extends EFilterType
  /* 4 */ @js.native
  object Paeth extends TopLevel[Paeth with Double]
  
  @js.native
  sealed trait Sub extends EFilterType
  /* 1 */ @js.native
  object Sub extends TopLevel[Sub with Double]
  
  @js.native
  sealed trait Up extends EFilterType
  /* 2 */ @js.native
  object Up extends TopLevel[Up with Double]
}
