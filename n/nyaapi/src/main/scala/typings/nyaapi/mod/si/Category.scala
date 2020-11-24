package typings.nyaapi.mod.si

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Category extends js.Object
@JSImport("nyaapi", "si.Category")
@js.native
object Category extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category with String] = js.native
  
  @js.native
  sealed trait ANIME extends Category
  /* "1_0" */ @js.native
  object ANIME extends TopLevel[ANIME with String]
  
  @js.native
  sealed trait ANIME_AMV extends Category
  /* "1_1" */ @js.native
  object ANIME_AMV extends TopLevel[ANIME_AMV with String]
  
  @js.native
  sealed trait ANIME_ENGLISH extends Category
  /* "1_2" */ @js.native
  object ANIME_ENGLISH extends TopLevel[ANIME_ENGLISH with String]
  
  @js.native
  sealed trait ANIME_NON_ENGLISH extends Category
  /* "1_3" */ @js.native
  object ANIME_NON_ENGLISH extends TopLevel[ANIME_NON_ENGLISH with String]
  
  @js.native
  sealed trait ANIME_RAW extends Category
  /* "1_4" */ @js.native
  object ANIME_RAW extends TopLevel[ANIME_RAW with String]
  
  @js.native
  sealed trait AUDIO extends Category
  /* "2_0" */ @js.native
  object AUDIO extends TopLevel[AUDIO with String]
  
  @js.native
  sealed trait AUDIO_LOSSLESS extends Category
  /* "2_1" */ @js.native
  object AUDIO_LOSSLESS extends TopLevel[AUDIO_LOSSLESS with String]
  
  @js.native
  sealed trait AUDIO_LOSSY extends Category
  /* "2_2" */ @js.native
  object AUDIO_LOSSY extends TopLevel[AUDIO_LOSSY with String]
  
  @js.native
  sealed trait LITERATURE extends Category
  /* "3_0" */ @js.native
  object LITERATURE extends TopLevel[LITERATURE with String]
  
  @js.native
  sealed trait LITERATURE_ENGLISH extends Category
  /* "3_1" */ @js.native
  object LITERATURE_ENGLISH extends TopLevel[LITERATURE_ENGLISH with String]
  
  @js.native
  sealed trait LITERATURE_NON_ENGLISH extends Category
  /* "3_2" */ @js.native
  object LITERATURE_NON_ENGLISH extends TopLevel[LITERATURE_NON_ENGLISH with String]
  
  @js.native
  sealed trait LITERATURE_RAW extends Category
  /* "3_3" */ @js.native
  object LITERATURE_RAW extends TopLevel[LITERATURE_RAW with String]
  
  @js.native
  sealed trait LIVE_ACTION extends Category
  /* "4_0" */ @js.native
  object LIVE_ACTION extends TopLevel[LIVE_ACTION with String]
  
  @js.native
  sealed trait LIVE_ACTION_ENGLISH extends Category
  /* "4_1" */ @js.native
  object LIVE_ACTION_ENGLISH extends TopLevel[LIVE_ACTION_ENGLISH with String]
  
  @js.native
  sealed trait LIVE_ACTION_IDOL_PV extends Category
  /* "4_2" */ @js.native
  object LIVE_ACTION_IDOL_PV extends TopLevel[LIVE_ACTION_IDOL_PV with String]
  
  @js.native
  sealed trait LIVE_ACTION_NON_ENGLISH extends Category
  /* "4_3" */ @js.native
  object LIVE_ACTION_NON_ENGLISH extends TopLevel[LIVE_ACTION_NON_ENGLISH with String]
  
  @js.native
  sealed trait LIVE_ACTION_RAW extends Category
  /* "4_4" */ @js.native
  object LIVE_ACTION_RAW extends TopLevel[LIVE_ACTION_RAW with String]
  
  @js.native
  sealed trait PICTURES extends Category
  /* "5_0" */ @js.native
  object PICTURES extends TopLevel[PICTURES with String]
  
  @js.native
  sealed trait PICTURES_GRAPHICS extends Category
  /* "5_1" */ @js.native
  object PICTURES_GRAPHICS extends TopLevel[PICTURES_GRAPHICS with String]
  
  @js.native
  sealed trait PICTURES_PHOTOS extends Category
  /* "5_2" */ @js.native
  object PICTURES_PHOTOS extends TopLevel[PICTURES_PHOTOS with String]
  
  @js.native
  sealed trait SOFTWARE extends Category
  /* "6_0" */ @js.native
  object SOFTWARE extends TopLevel[SOFTWARE with String]
  
  @js.native
  sealed trait SOFTWARE_APPS extends Category
  /* "6_1" */ @js.native
  object SOFTWARE_APPS extends TopLevel[SOFTWARE_APPS with String]
  
  @js.native
  sealed trait SOFTWARE_GAMES extends Category
  /* "6_2" */ @js.native
  object SOFTWARE_GAMES extends TopLevel[SOFTWARE_GAMES with String]
}
