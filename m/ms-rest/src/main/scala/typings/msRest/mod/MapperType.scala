package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapperType extends StObject
@JSImport("ms-rest", "MapperType")
@js.native
object MapperType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapperType with Double] = js.native
  
  @js.native
  sealed trait Base64Url extends MapperType
  /* 0 */ val Base64Url: typings.msRest.mod.MapperType.Base64Url with Double = js.native
  
  @js.native
  sealed trait Boolean extends MapperType
  /* 1 */ val Boolean: typings.msRest.mod.MapperType.Boolean with Double = js.native
  
  @js.native
  sealed trait ByteArray extends MapperType
  /* 2 */ val ByteArray: typings.msRest.mod.MapperType.ByteArray with Double = js.native
  
  @js.native
  sealed trait Composite extends MapperType
  /* 3 */ val Composite: typings.msRest.mod.MapperType.Composite with Double = js.native
  
  @js.native
  sealed trait Date extends MapperType
  /* 4 */ val Date: typings.msRest.mod.MapperType.Date with Double = js.native
  
  @js.native
  sealed trait DateTime extends MapperType
  /* 5 */ val DateTime: typings.msRest.mod.MapperType.DateTime with Double = js.native
  
  @js.native
  sealed trait DateTimeRfc1123 extends MapperType
  /* 6 */ val DateTimeRfc1123: typings.msRest.mod.MapperType.DateTimeRfc1123 with Double = js.native
  
  @js.native
  sealed trait Dictionary extends MapperType
  /* 7 */ val Dictionary: typings.msRest.mod.MapperType.Dictionary with Double = js.native
  
  @js.native
  sealed trait Enum extends MapperType
  /* 8 */ val Enum: typings.msRest.mod.MapperType.Enum with Double = js.native
  
  @js.native
  sealed trait Number extends MapperType
  /* 9 */ val Number: typings.msRest.mod.MapperType.Number with Double = js.native
  
  @js.native
  sealed trait Object extends MapperType
  /* 10 */ val Object: typings.msRest.mod.MapperType.Object with Double = js.native
  
  @js.native
  sealed trait Sequence extends MapperType
  /* 11 */ val Sequence: typings.msRest.mod.MapperType.Sequence with Double = js.native
  
  @js.native
  sealed trait Stream extends MapperType
  /* 13 */ val Stream: typings.msRest.mod.MapperType.Stream with Double = js.native
  
  @js.native
  sealed trait String extends MapperType
  /* 12 */ val String: typings.msRest.mod.MapperType.String with Double = js.native
  
  @js.native
  sealed trait TimeSpan extends MapperType
  /* 14 */ val TimeSpan: typings.msRest.mod.MapperType.TimeSpan with Double = js.native
  
  @js.native
  sealed trait UnixTime extends MapperType
  /* 15 */ val UnixTime: typings.msRest.mod.MapperType.UnixTime with Double = js.native
}
