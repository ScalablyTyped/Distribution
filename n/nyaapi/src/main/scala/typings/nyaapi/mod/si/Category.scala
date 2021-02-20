package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Category extends StObject
@JSImport("nyaapi", "si.Category")
@js.native
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category with String] = js.native
  
  @js.native
  sealed trait ANIME extends Category
  /* "1_0" */ val ANIME: typings.nyaapi.mod.si.Category.ANIME with String = js.native
  
  @js.native
  sealed trait ANIME_AMV extends Category
  /* "1_1" */ val ANIME_AMV: typings.nyaapi.mod.si.Category.ANIME_AMV with String = js.native
  
  @js.native
  sealed trait ANIME_ENGLISH extends Category
  /* "1_2" */ val ANIME_ENGLISH: typings.nyaapi.mod.si.Category.ANIME_ENGLISH with String = js.native
  
  @js.native
  sealed trait ANIME_NON_ENGLISH extends Category
  /* "1_3" */ val ANIME_NON_ENGLISH: typings.nyaapi.mod.si.Category.ANIME_NON_ENGLISH with String = js.native
  
  @js.native
  sealed trait ANIME_RAW extends Category
  /* "1_4" */ val ANIME_RAW: typings.nyaapi.mod.si.Category.ANIME_RAW with String = js.native
  
  @js.native
  sealed trait AUDIO extends Category
  /* "2_0" */ val AUDIO: typings.nyaapi.mod.si.Category.AUDIO with String = js.native
  
  @js.native
  sealed trait AUDIO_LOSSLESS extends Category
  /* "2_1" */ val AUDIO_LOSSLESS: typings.nyaapi.mod.si.Category.AUDIO_LOSSLESS with String = js.native
  
  @js.native
  sealed trait AUDIO_LOSSY extends Category
  /* "2_2" */ val AUDIO_LOSSY: typings.nyaapi.mod.si.Category.AUDIO_LOSSY with String = js.native
  
  @js.native
  sealed trait LITERATURE extends Category
  /* "3_0" */ val LITERATURE: typings.nyaapi.mod.si.Category.LITERATURE with String = js.native
  
  @js.native
  sealed trait LITERATURE_ENGLISH extends Category
  /* "3_1" */ val LITERATURE_ENGLISH: typings.nyaapi.mod.si.Category.LITERATURE_ENGLISH with String = js.native
  
  @js.native
  sealed trait LITERATURE_NON_ENGLISH extends Category
  /* "3_2" */ val LITERATURE_NON_ENGLISH: typings.nyaapi.mod.si.Category.LITERATURE_NON_ENGLISH with String = js.native
  
  @js.native
  sealed trait LITERATURE_RAW extends Category
  /* "3_3" */ val LITERATURE_RAW: typings.nyaapi.mod.si.Category.LITERATURE_RAW with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION extends Category
  /* "4_0" */ val LIVE_ACTION: typings.nyaapi.mod.si.Category.LIVE_ACTION with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_ENGLISH extends Category
  /* "4_1" */ val LIVE_ACTION_ENGLISH: typings.nyaapi.mod.si.Category.LIVE_ACTION_ENGLISH with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_IDOL_PV extends Category
  /* "4_2" */ val LIVE_ACTION_IDOL_PV: typings.nyaapi.mod.si.Category.LIVE_ACTION_IDOL_PV with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_NON_ENGLISH extends Category
  /* "4_3" */ val LIVE_ACTION_NON_ENGLISH: typings.nyaapi.mod.si.Category.LIVE_ACTION_NON_ENGLISH with String = js.native
  
  @js.native
  sealed trait LIVE_ACTION_RAW extends Category
  /* "4_4" */ val LIVE_ACTION_RAW: typings.nyaapi.mod.si.Category.LIVE_ACTION_RAW with String = js.native
  
  @js.native
  sealed trait PICTURES extends Category
  /* "5_0" */ val PICTURES: typings.nyaapi.mod.si.Category.PICTURES with String = js.native
  
  @js.native
  sealed trait PICTURES_GRAPHICS extends Category
  /* "5_1" */ val PICTURES_GRAPHICS: typings.nyaapi.mod.si.Category.PICTURES_GRAPHICS with String = js.native
  
  @js.native
  sealed trait PICTURES_PHOTOS extends Category
  /* "5_2" */ val PICTURES_PHOTOS: typings.nyaapi.mod.si.Category.PICTURES_PHOTOS with String = js.native
  
  @js.native
  sealed trait SOFTWARE extends Category
  /* "6_0" */ val SOFTWARE: typings.nyaapi.mod.si.Category.SOFTWARE with String = js.native
  
  @js.native
  sealed trait SOFTWARE_APPS extends Category
  /* "6_1" */ val SOFTWARE_APPS: typings.nyaapi.mod.si.Category.SOFTWARE_APPS with String = js.native
  
  @js.native
  sealed trait SOFTWARE_GAMES extends Category
  /* "6_2" */ val SOFTWARE_GAMES: typings.nyaapi.mod.si.Category.SOFTWARE_GAMES with String = js.native
}
