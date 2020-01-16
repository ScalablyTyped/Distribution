package typings.nyaapi.nyaapiMod.pantsu

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortType extends js.Object

@JSImport("nyaapi", "pantsu.SortType")
@js.native
object SortType extends js.Object {
  @js.native
  sealed trait completed extends SortType
  
  @js.native
  sealed trait date extends SortType
  
  @js.native
  sealed trait downloads extends SortType
  
  @js.native
  sealed trait id extends SortType
  
  @js.native
  sealed trait leechers extends SortType
  
  @js.native
  sealed trait name extends SortType
  
  @js.native
  sealed trait seeders extends SortType
  
  @js.native
  sealed trait size extends SortType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortType with Double] = js.native
  /* 7 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object date extends TopLevel[date with Double]
  
  /* 3 */ @js.native
  object downloads extends TopLevel[downloads with Double]
  
  /* 0 */ @js.native
  object id extends TopLevel[id with Double]
  
  /* 6 */ @js.native
  object leechers extends TopLevel[leechers with Double]
  
  /* 1 */ @js.native
  object name extends TopLevel[name with Double]
  
  /* 5 */ @js.native
  object seeders extends TopLevel[seeders with Double]
  
  /* 4 */ @js.native
  object size extends TopLevel[size with Double]
  
}

