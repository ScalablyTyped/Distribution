package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortType extends StObject
@JSImport("nyaapi", "pantsu.SortType")
@js.native
object SortType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortType & Double] = js.native
  
  @js.native
  sealed trait completed
    extends StObject
       with SortType
  /* 7 */ val completed: typings.nyaapi.mod.pantsu.SortType.completed & Double = js.native
  
  @js.native
  sealed trait date
    extends StObject
       with SortType
  /* 2 */ val date: typings.nyaapi.mod.pantsu.SortType.date & Double = js.native
  
  @js.native
  sealed trait downloads
    extends StObject
       with SortType
  /* 3 */ val downloads: typings.nyaapi.mod.pantsu.SortType.downloads & Double = js.native
  
  @js.native
  sealed trait id
    extends StObject
       with SortType
  /* 0 */ val id: typings.nyaapi.mod.pantsu.SortType.id & Double = js.native
  
  @js.native
  sealed trait leechers
    extends StObject
       with SortType
  /* 6 */ val leechers: typings.nyaapi.mod.pantsu.SortType.leechers & Double = js.native
  
  @js.native
  sealed trait name
    extends StObject
       with SortType
  /* 1 */ val name: typings.nyaapi.mod.pantsu.SortType.name & Double = js.native
  
  @js.native
  sealed trait seeders
    extends StObject
       with SortType
  /* 5 */ val seeders: typings.nyaapi.mod.pantsu.SortType.seeders & Double = js.native
  
  @js.native
  sealed trait size
    extends StObject
       with SortType
  /* 4 */ val size: typings.nyaapi.mod.pantsu.SortType.size & Double = js.native
}
