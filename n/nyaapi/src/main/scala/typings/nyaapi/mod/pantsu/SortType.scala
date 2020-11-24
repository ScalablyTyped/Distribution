package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortType extends js.Object
@JSImport("nyaapi", "pantsu.SortType")
@js.native
object SortType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortType with Double] = js.native
  
  @js.native
  sealed trait completed extends SortType
  /* 7 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  @js.native
  sealed trait date extends SortType
  /* 2 */ @js.native
  object date extends TopLevel[date with Double]
  
  @js.native
  sealed trait downloads extends SortType
  /* 3 */ @js.native
  object downloads extends TopLevel[downloads with Double]
  
  @js.native
  sealed trait id extends SortType
  /* 0 */ @js.native
  object id extends TopLevel[id with Double]
  
  @js.native
  sealed trait leechers extends SortType
  /* 6 */ @js.native
  object leechers extends TopLevel[leechers with Double]
  
  @js.native
  sealed trait name extends SortType
  /* 1 */ @js.native
  object name extends TopLevel[name with Double]
  
  @js.native
  sealed trait seeders extends SortType
  /* 5 */ @js.native
  object seeders extends TopLevel[seeders with Double]
  
  @js.native
  sealed trait size extends SortType
  /* 4 */ @js.native
  object size extends TopLevel[size with Double]
}
