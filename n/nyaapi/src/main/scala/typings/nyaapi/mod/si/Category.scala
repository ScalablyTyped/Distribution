package typings.nyaapi.mod.si

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Category extends js.Object

@JSImport("nyaapi", "si.Category")
@js.native
object Category extends js.Object {
  @js.native
  sealed trait ANIME extends Category
  
  @js.native
  sealed trait ANIME_AMV extends Category
  
  @js.native
  sealed trait ANIME_ENGLISH extends Category
  
  @js.native
  sealed trait ANIME_NON_ENGLISH extends Category
  
  @js.native
  sealed trait ANIME_RAW extends Category
  
  @js.native
  sealed trait AUDIO extends Category
  
  @js.native
  sealed trait AUDIO_LOSSLESS extends Category
  
  @js.native
  sealed trait AUDIO_LOSSY extends Category
  
  @js.native
  sealed trait LITERATURE extends Category
  
  @js.native
  sealed trait LITERATURE_ENGLISH extends Category
  
  @js.native
  sealed trait LITERATURE_NON_ENGLISH extends Category
  
  @js.native
  sealed trait LITERATURE_RAW extends Category
  
  @js.native
  sealed trait LIVE_ACTION extends Category
  
  @js.native
  sealed trait LIVE_ACTION_ENGLISH extends Category
  
  @js.native
  sealed trait LIVE_ACTION_IDOL_PV extends Category
  
  @js.native
  sealed trait LIVE_ACTION_NON_ENGLISH extends Category
  
  @js.native
  sealed trait LIVE_ACTION_RAW extends Category
  
  @js.native
  sealed trait PICTURES extends Category
  
  @js.native
  sealed trait PICTURES_GRAPHICS extends Category
  
  @js.native
  sealed trait PICTURES_PHOTOS extends Category
  
  @js.native
  sealed trait SOFTWARE extends Category
  
  @js.native
  sealed trait SOFTWARE_APPS extends Category
  
  @js.native
  sealed trait SOFTWARE_GAMES extends Category
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category with String] = js.native
  /* "1_0" */ @js.native
  object ANIME extends TopLevel[ANIME with String]
  
  /* "1_1" */ @js.native
  object ANIME_AMV extends TopLevel[ANIME_AMV with String]
  
  /* "1_2" */ @js.native
  object ANIME_ENGLISH extends TopLevel[ANIME_ENGLISH with String]
  
  /* "1_3" */ @js.native
  object ANIME_NON_ENGLISH extends TopLevel[ANIME_NON_ENGLISH with String]
  
  /* "1_4" */ @js.native
  object ANIME_RAW extends TopLevel[ANIME_RAW with String]
  
  /* "2_0" */ @js.native
  object AUDIO extends TopLevel[AUDIO with String]
  
  /* "2_1" */ @js.native
  object AUDIO_LOSSLESS extends TopLevel[AUDIO_LOSSLESS with String]
  
  /* "2_2" */ @js.native
  object AUDIO_LOSSY extends TopLevel[AUDIO_LOSSY with String]
  
  /* "3_0" */ @js.native
  object LITERATURE extends TopLevel[LITERATURE with String]
  
  /* "3_1" */ @js.native
  object LITERATURE_ENGLISH extends TopLevel[LITERATURE_ENGLISH with String]
  
  /* "3_2" */ @js.native
  object LITERATURE_NON_ENGLISH extends TopLevel[LITERATURE_NON_ENGLISH with String]
  
  /* "3_3" */ @js.native
  object LITERATURE_RAW extends TopLevel[LITERATURE_RAW with String]
  
  /* "4_0" */ @js.native
  object LIVE_ACTION extends TopLevel[LIVE_ACTION with String]
  
  /* "4_1" */ @js.native
  object LIVE_ACTION_ENGLISH extends TopLevel[LIVE_ACTION_ENGLISH with String]
  
  /* "4_2" */ @js.native
  object LIVE_ACTION_IDOL_PV extends TopLevel[LIVE_ACTION_IDOL_PV with String]
  
  /* "4_3" */ @js.native
  object LIVE_ACTION_NON_ENGLISH extends TopLevel[LIVE_ACTION_NON_ENGLISH with String]
  
  /* "4_4" */ @js.native
  object LIVE_ACTION_RAW extends TopLevel[LIVE_ACTION_RAW with String]
  
  /* "5_0" */ @js.native
  object PICTURES extends TopLevel[PICTURES with String]
  
  /* "5_1" */ @js.native
  object PICTURES_GRAPHICS extends TopLevel[PICTURES_GRAPHICS with String]
  
  /* "5_2" */ @js.native
  object PICTURES_PHOTOS extends TopLevel[PICTURES_PHOTOS with String]
  
  /* "6_0" */ @js.native
  object SOFTWARE extends TopLevel[SOFTWARE with String]
  
  /* "6_1" */ @js.native
  object SOFTWARE_APPS extends TopLevel[SOFTWARE_APPS with String]
  
  /* "6_2" */ @js.native
  object SOFTWARE_GAMES extends TopLevel[SOFTWARE_GAMES with String]
  
}

