package typings.msRest.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapperType extends js.Object
@JSImport("ms-rest", "MapperType")
@js.native
object MapperType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapperType with Double] = js.native
  
  @js.native
  sealed trait Base64Url extends MapperType
  /* 0 */ @js.native
  object Base64Url extends TopLevel[Base64Url with Double]
  
  @js.native
  sealed trait Boolean extends MapperType
  /* 1 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  @js.native
  sealed trait ByteArray extends MapperType
  /* 2 */ @js.native
  object ByteArray extends TopLevel[ByteArray with Double]
  
  @js.native
  sealed trait Composite extends MapperType
  /* 3 */ @js.native
  object Composite extends TopLevel[Composite with Double]
  
  @js.native
  sealed trait Date extends MapperType
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  @js.native
  sealed trait DateTime extends MapperType
  /* 5 */ @js.native
  object DateTime extends TopLevel[DateTime with Double]
  
  @js.native
  sealed trait DateTimeRfc1123 extends MapperType
  /* 6 */ @js.native
  object DateTimeRfc1123 extends TopLevel[DateTimeRfc1123 with Double]
  
  @js.native
  sealed trait Dictionary extends MapperType
  /* 7 */ @js.native
  object Dictionary extends TopLevel[Dictionary with Double]
  
  @js.native
  sealed trait Enum extends MapperType
  /* 8 */ @js.native
  object Enum extends TopLevel[Enum with Double]
  
  @js.native
  sealed trait Number extends MapperType
  /* 9 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  @js.native
  sealed trait Object extends MapperType
  /* 10 */ @js.native
  object Object extends TopLevel[Object with Double]
  
  @js.native
  sealed trait Sequence extends MapperType
  /* 11 */ @js.native
  object Sequence extends TopLevel[Sequence with Double]
  
  @js.native
  sealed trait Stream extends MapperType
  /* 13 */ @js.native
  object Stream extends TopLevel[Stream with Double]
  
  @js.native
  sealed trait String extends MapperType
  /* 12 */ @js.native
  object String extends TopLevel[String with Double]
  
  @js.native
  sealed trait TimeSpan extends MapperType
  /* 14 */ @js.native
  object TimeSpan extends TopLevel[TimeSpan with Double]
  
  @js.native
  sealed trait UnixTime extends MapperType
  /* 15 */ @js.native
  object UnixTime extends TopLevel[UnixTime with Double]
}
