package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapperType extends StObject
@JSImport("ms-rest", "MapperType")
@js.native
object MapperType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapperType & Double] = js.native
  
  @js.native
  sealed trait Base64Url
    extends StObject
       with MapperType
  /* 0 */ val Base64Url: typings.msRest.mod.MapperType.Base64Url & Double = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with MapperType
  /* 1 */ val Boolean: typings.msRest.mod.MapperType.Boolean & Double = js.native
  
  @js.native
  sealed trait ByteArray
    extends StObject
       with MapperType
  /* 2 */ val ByteArray: typings.msRest.mod.MapperType.ByteArray & Double = js.native
  
  @js.native
  sealed trait Composite
    extends StObject
       with MapperType
  /* 3 */ val Composite: typings.msRest.mod.MapperType.Composite & Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with MapperType
  /* 4 */ val Date: typings.msRest.mod.MapperType.Date & Double = js.native
  
  @js.native
  sealed trait DateTime
    extends StObject
       with MapperType
  /* 5 */ val DateTime: typings.msRest.mod.MapperType.DateTime & Double = js.native
  
  @js.native
  sealed trait DateTimeRfc1123
    extends StObject
       with MapperType
  /* 6 */ val DateTimeRfc1123: typings.msRest.mod.MapperType.DateTimeRfc1123 & Double = js.native
  
  @js.native
  sealed trait Dictionary
    extends StObject
       with MapperType
  /* 7 */ val Dictionary: typings.msRest.mod.MapperType.Dictionary & Double = js.native
  
  @js.native
  sealed trait Enum
    extends StObject
       with MapperType
  /* 8 */ val Enum: typings.msRest.mod.MapperType.Enum & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with MapperType
  /* 9 */ val Number: typings.msRest.mod.MapperType.Number & Double = js.native
  
  @js.native
  sealed trait Object
    extends StObject
       with MapperType
  /* 10 */ val Object: typings.msRest.mod.MapperType.Object & Double = js.native
  
  @js.native
  sealed trait Sequence
    extends StObject
       with MapperType
  /* 11 */ val Sequence: typings.msRest.mod.MapperType.Sequence & Double = js.native
  
  @js.native
  sealed trait Stream
    extends StObject
       with MapperType
  /* 13 */ val Stream: typings.msRest.mod.MapperType.Stream & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with MapperType
  /* 12 */ val String: typings.msRest.mod.MapperType.String & Double = js.native
  
  @js.native
  sealed trait TimeSpan
    extends StObject
       with MapperType
  /* 14 */ val TimeSpan: typings.msRest.mod.MapperType.TimeSpan & Double = js.native
  
  @js.native
  sealed trait UnixTime
    extends StObject
       with MapperType
  /* 15 */ val UnixTime: typings.msRest.mod.MapperType.UnixTime & Double = js.native
}
