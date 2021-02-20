package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Category extends StObject
@JSImport("nyaapi", "pantsu.Category")
@js.native
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category with String] = js.native
  
  @js.native
  sealed trait ALL extends Category
  /* "_" */ val ALL: typings.nyaapi.mod.pantsu.Category.ALL with String = js.native
  
  @js.native
  sealed trait ANIME extends Category
  /* "3_" */ val ANIME: typings.nyaapi.mod.pantsu.Category.ANIME with String = js.native
  
  @js.native
  sealed trait ANIME_AMV extends Category
  /* "3_12" */ val ANIME_AMV: typings.nyaapi.mod.pantsu.Category.ANIME_AMV with String = js.native
  
  @js.native
  sealed trait ANIME_ENGLISH extends Category
  /* "3_5" */ val ANIME_ENGLISH: typings.nyaapi.mod.pantsu.Category.ANIME_ENGLISH with String = js.native
  
  @js.native
  sealed trait ANIME_NON_ENGLISH extends Category
  /* "3_13" */ val ANIME_NON_ENGLISH: typings.nyaapi.mod.pantsu.Category.ANIME_NON_ENGLISH with String = js.native
  
  @js.native
  sealed trait ANIME_RAW extends Category
  /* "3_6" */ val ANIME_RAW: typings.nyaapi.mod.pantsu.Category.ANIME_RAW with String = js.native
  
  @js.native
  sealed trait AUDIO extends Category
  /* "2_" */ val AUDIO: typings.nyaapi.mod.pantsu.Category.AUDIO with String = js.native
  
  @js.native
  sealed trait AUDIO_LOSSLESS extends Category
  /* "2_3" */ val AUDIO_LOSSLESS: typings.nyaapi.mod.pantsu.Category.AUDIO_LOSSLESS with String = js.native
  
  @js.native
  sealed trait AUDIO_LOSSY extends Category
  /* "2_4" */ val AUDIO_LOSSY: typings.nyaapi.mod.pantsu.Category.AUDIO_LOSSY with String = js.native
  
  @js.native
  sealed trait LITERATURE extends Category
  /* "4_" */ val LITERATURE: typings.nyaapi.mod.pantsu.Category.LITERATURE with String = js.native
  
  @js.native
  sealed trait LITERATURE_ENGLISH extends Category
  /* "4_7" */ val LITERATURE_ENGLISH: typings.nyaapi.mod.pantsu.Category.LITERATURE_ENGLISH with String = js.native
  
  @js.native
  sealed trait LITERATURE_NON_ENGLISH extends Category
  /* "4_14" */ val LITERATURE_NON_ENGLISH: typings.nyaapi.mod.pantsu.Category.LITERATURE_NON_ENGLISH with String = js.native
  
  @js.native
  sealed trait LITERATURE_RAW extends Category
  /* "4_8" */ val LITERATURE_RAW: typings.nyaapi.mod.pantsu.Category.LITERATURE_RAW with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION extends Category
  /* "5_" */ val LIVE_ACTION: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_ENGLISH extends Category
  /* "5_9" */ val LIVE_ACTION_ENGLISH: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_ENGLISH with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_IDOL_PV extends Category
  /* "5_10" */ val LIVE_ACTION_IDOL_PV: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_IDOL_PV with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_NON_ENGLISH extends Category
  /* "5_18" */ val LIVE_ACTION_NON_ENGLISH: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_NON_ENGLISH with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_RAW extends Category
  /* "5_11" */ val LIVE_ACTION_RAW: typings.nyaapi.mod.pantsu.Category.LIVE_ACTION_RAW with String = js.native
  
  @js.native
  sealed trait PICTURES extends Category
  /* "6_" */ val PICTURES: typings.nyaapi.mod.pantsu.Category.PICTURES with String = js.native
  
  @js.native
  sealed trait PICTURES_GRAPHICS extends Category
  /* "6_15" */ val PICTURES_GRAPHICS: typings.nyaapi.mod.pantsu.Category.PICTURES_GRAPHICS with String = js.native
  
  @js.native
  sealed trait PICTURES_PHOTOS extends Category
  /* "6_16" */ val PICTURES_PHOTOS: typings.nyaapi.mod.pantsu.Category.PICTURES_PHOTOS with String = js.native
  
  @js.native
  sealed trait SOFTWARE extends Category
  /* "1_" */ val SOFTWARE: typings.nyaapi.mod.pantsu.Category.SOFTWARE with String = js.native
  
  @js.native
  sealed trait SOFTWARE_APPS extends Category
  /* "1_1" */ val SOFTWARE_APPS: typings.nyaapi.mod.pantsu.Category.SOFTWARE_APPS with String = js.native
  
  @js.native
  sealed trait SOFTWARE_GAMES extends Category
  /* "1_2" */ val SOFTWARE_GAMES: typings.nyaapi.mod.pantsu.Category.SOFTWARE_GAMES with String = js.native
}
