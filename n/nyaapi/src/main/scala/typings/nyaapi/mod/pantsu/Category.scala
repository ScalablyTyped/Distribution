package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Category extends StObject
@JSImport("nyaapi", "pantsu.Category")
@js.native
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category & String] = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with Category
  /* "_" */ val ALL: typings.nyaapi.mod.pantsu.Category.ALL & String = js.native
  
  @js.native
  sealed trait ANIME
    extends StObject
       with Category
  /* "3_" */ val ANIME: typings.nyaapi.mod.pantsu.Category.ANIME & String = js.native
  
  @js.native
  sealed trait ANIME_AMV
    extends StObject
       with Category
  /* "3_12" */ val ANIME_AMV: typings.nyaapi.mod.pantsu.Category.ANIME_AMV & String = js.native
  
  @js.native
  sealed trait ANIME_ENGLISH
    extends StObject
       with Category
  /* "3_5" */ val ANIME_ENGLISH: typings.nyaapi.mod.pantsu.Category.ANIME_ENGLISH & String = js.native
  
  @js.native
  sealed trait ANIME_NON_ENGLISH
    extends StObject
       with Category
  /* "3_13" */ val ANIME_NON_ENGLISH: typings.nyaapi.mod.pantsu.Category.ANIME_NON_ENGLISH & String = js.native
  
  @js.native
  sealed trait ANIME_RAW
    extends StObject
       with Category
  /* "3_6" */ val ANIME_RAW: typings.nyaapi.mod.pantsu.Category.ANIME_RAW & String = js.native
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with Category
  /* "2_" */ val AUDIO: typings.nyaapi.mod.pantsu.Category.AUDIO & String = js.native
  
  @js.native
  sealed trait AUDIO_LOSSLESS
    extends StObject
       with Category
  /* "2_3" */ val AUDIO_LOSSLESS: typings.nyaapi.mod.pantsu.Category.AUDIO_LOSSLESS & String = js.native
  
  @js.native
  sealed trait AUDIO_LOSSY
    extends StObject
       with Category
  /* "2_4" */ val AUDIO_LOSSY: typings.nyaapi.mod.pantsu.Category.AUDIO_LOSSY & String = js.native
  
  @js.native
  sealed trait LITERATURE
    extends StObject
       with Category
  /* "4_" */ val LITERATURE: typings.nyaapi.mod.pantsu.Category.LITERATURE & String = js.native
  
  @js.native
  sealed trait LITERATURE_ENGLISH
    extends StObject
       with Category
  /* "4_7" */ val LITERATURE_ENGLISH: typings.nyaapi.mod.pantsu.Category.LITERATURE_ENGLISH & String = js.native
  
  @js.native
  sealed trait LITERATURE_NON_ENGLISH
    extends StObject
       with Category
  /* "4_14" */ val LITERATURE_NON_ENGLISH: typings.nyaapi.mod.pantsu.Category.LITERATURE_NON_ENGLISH & String = js.native
  
  @js.native
  sealed trait LITERATURE_RAW
    extends StObject
       with Category
  /* "4_8" */ val LITERATURE_RAW: typings.nyaapi.mod.pantsu.Category.LITERATURE_RAW & String = js.native
  
  @js.native
  sealed trait LIVE_ACTION
    extends StObject
       with Category
  /* "5_" */ val LIVE_ACTION: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION & String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_ENGLISH
    extends StObject
       with Category
  /* "5_9" */ val LIVE_ACTION_ENGLISH: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_ENGLISH & String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_IDOL_PV
    extends StObject
       with Category
  /* "5_10" */ val LIVE_ACTION_IDOL_PV: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_IDOL_PV & String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_NON_ENGLISH
    extends StObject
       with Category
  /* "5_18" */ val LIVE_ACTION_NON_ENGLISH: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_NON_ENGLISH & String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_RAW
    extends StObject
       with Category
  /* "5_11" */ val LIVE_ACTION_RAW: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_RAW & String = js.native
  
  @js.native
  sealed trait PICTURES
    extends StObject
       with Category
  /* "6_" */ val PICTURES: typings.nyaapi.mod.pantsu.Category.PICTURES & String = js.native
  
  @js.native
  sealed trait PICTURES_GRAPHICS
    extends StObject
       with Category
  /* "6_15" */ val PICTURES_GRAPHICS: typings.nyaapi.mod.pantsu.Category.PICTURES_GRAPHICS & String = js.native
  
  @js.native
  sealed trait PICTURES_PHOTOS
    extends StObject
       with Category
  /* "6_16" */ val PICTURES_PHOTOS: typings.nyaapi.mod.pantsu.Category.PICTURES_PHOTOS & String = js.native
  
  @js.native
  sealed trait SOFTWARE
    extends StObject
       with Category
  /* "1_" */ val SOFTWARE: typings.nyaapi.mod.pantsu.Category.SOFTWARE & String = js.native
  
  @js.native
  sealed trait SOFTWARE_APPS
    extends StObject
       with Category
  /* "1_1" */ val SOFTWARE_APPS: typings.nyaapi.mod.pantsu.Category.SOFTWARE_APPS & String = js.native
  
  @js.native
  sealed trait SOFTWARE_GAMES
    extends StObject
       with Category
  /* "1_2" */ val SOFTWARE_GAMES: typings.nyaapi.mod.pantsu.Category.SOFTWARE_GAMES & String = js.native
}
