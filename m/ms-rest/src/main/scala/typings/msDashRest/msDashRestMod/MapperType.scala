package typings.msDashRest.msDashRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapperType extends js.Object

@JSImport("ms-rest", "MapperType")
@js.native
object MapperType extends js.Object {
  @js.native
  sealed trait Base64Url extends MapperType
  
  @js.native
  sealed trait Boolean extends MapperType
  
  @js.native
  sealed trait ByteArray extends MapperType
  
  @js.native
  sealed trait Composite extends MapperType
  
  @js.native
  sealed trait Date extends MapperType
  
  @js.native
  sealed trait DateTime extends MapperType
  
  @js.native
  sealed trait DateTimeRfc1123 extends MapperType
  
  @js.native
  sealed trait Dictionary extends MapperType
  
  @js.native
  sealed trait Enum extends MapperType
  
  @js.native
  sealed trait Number extends MapperType
  
  @js.native
  sealed trait Object extends MapperType
  
  @js.native
  sealed trait Sequence extends MapperType
  
  @js.native
  sealed trait Stream extends MapperType
  
  @js.native
  sealed trait String extends MapperType
  
  @js.native
  sealed trait TimeSpan extends MapperType
  
  @js.native
  sealed trait UnixTime extends MapperType
  
  /* 0 */ val Base64Url: typings.msDashRest.msDashRestMod.MapperType.Base64Url with Double = js.native
  /* 1 */ val Boolean: typings.msDashRest.msDashRestMod.MapperType.Boolean with Double = js.native
  /* 2 */ val ByteArray: typings.msDashRest.msDashRestMod.MapperType.ByteArray with Double = js.native
  /* 3 */ val Composite: typings.msDashRest.msDashRestMod.MapperType.Composite with Double = js.native
  /* 4 */ val Date: typings.msDashRest.msDashRestMod.MapperType.Date with Double = js.native
  /* 5 */ val DateTime: typings.msDashRest.msDashRestMod.MapperType.DateTime with Double = js.native
  /* 6 */ val DateTimeRfc1123: typings.msDashRest.msDashRestMod.MapperType.DateTimeRfc1123 with Double = js.native
  /* 7 */ val Dictionary: typings.msDashRest.msDashRestMod.MapperType.Dictionary with Double = js.native
  /* 8 */ val Enum: typings.msDashRest.msDashRestMod.MapperType.Enum with Double = js.native
  /* 9 */ val Number: typings.msDashRest.msDashRestMod.MapperType.Number with Double = js.native
  /* 10 */ val Object: typings.msDashRest.msDashRestMod.MapperType.Object with Double = js.native
  /* 11 */ val Sequence: typings.msDashRest.msDashRestMod.MapperType.Sequence with Double = js.native
  /* 13 */ val Stream: typings.msDashRest.msDashRestMod.MapperType.Stream with Double = js.native
  /* 12 */ val String: typings.msDashRest.msDashRestMod.MapperType.String with Double = js.native
  /* 14 */ val TimeSpan: typings.msDashRest.msDashRestMod.MapperType.TimeSpan with Double = js.native
  /* 15 */ val UnixTime: typings.msDashRest.msDashRestMod.MapperType.UnixTime with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapperType with Double] = js.native
}

