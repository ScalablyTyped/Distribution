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
  sealed trait `1_`
    extends StObject
       with Category
  /* "SOFTWARE" */ val `1_`: typings.nyaapi.mod.pantsu.Category.`1_` & String = js.native
  
  @js.native
  sealed trait `1_1`
    extends StObject
       with Category
  /* "SOFTWARE_APPS" */ val `1_1`: typings.nyaapi.mod.pantsu.Category.`1_1` & String = js.native
  
  @js.native
  sealed trait `1_2`
    extends StObject
       with Category
  /* "SOFTWARE_GAMES" */ val `1_2`: typings.nyaapi.mod.pantsu.Category.`1_2` & String = js.native
  
  @js.native
  sealed trait `2_`
    extends StObject
       with Category
  /* "AUDIO" */ val `2_`: typings.nyaapi.mod.pantsu.Category.`2_` & String = js.native
  
  @js.native
  sealed trait `2_3`
    extends StObject
       with Category
  /* "AUDIO_LOSSLESS" */ val `2_3`: typings.nyaapi.mod.pantsu.Category.`2_3` & String = js.native
  
  @js.native
  sealed trait `2_4`
    extends StObject
       with Category
  /* "AUDIO_LOSSY" */ val `2_4`: typings.nyaapi.mod.pantsu.Category.`2_4` & String = js.native
  
  @js.native
  sealed trait `3_`
    extends StObject
       with Category
  /* "ANIME" */ val `3_`: typings.nyaapi.mod.pantsu.Category.`3_` & String = js.native
  
  @js.native
  sealed trait `3_12`
    extends StObject
       with Category
  /* "ANIME_AMV" */ val `3_12`: typings.nyaapi.mod.pantsu.Category.`3_12` & String = js.native
  
  @js.native
  sealed trait `3_13`
    extends StObject
       with Category
  /* "ANIME_NON_ENGLISH" */ val `3_13`: typings.nyaapi.mod.pantsu.Category.`3_13` & String = js.native
  
  @js.native
  sealed trait `3_5`
    extends StObject
       with Category
  /* "ANIME_ENGLISH" */ val `3_5`: typings.nyaapi.mod.pantsu.Category.`3_5` & String = js.native
  
  @js.native
  sealed trait `3_6`
    extends StObject
       with Category
  /* "ANIME_RAW" */ val `3_6`: typings.nyaapi.mod.pantsu.Category.`3_6` & String = js.native
  
  @js.native
  sealed trait `4_`
    extends StObject
       with Category
  /* "LITERATURE" */ val `4_`: typings.nyaapi.mod.pantsu.Category.`4_` & String = js.native
  
  @js.native
  sealed trait `4_14`
    extends StObject
       with Category
  /* "LITERATURE_NON_ENGLISH" */ val `4_14`: typings.nyaapi.mod.pantsu.Category.`4_14` & String = js.native
  
  @js.native
  sealed trait `4_7`
    extends StObject
       with Category
  /* "LITERATURE_ENGLISH" */ val `4_7`: typings.nyaapi.mod.pantsu.Category.`4_7` & String = js.native
  
  @js.native
  sealed trait `4_8`
    extends StObject
       with Category
  /* "LITERATURE_RAW" */ val `4_8`: typings.nyaapi.mod.pantsu.Category.`4_8` & String = js.native
  
  @js.native
  sealed trait `5_`
    extends StObject
       with Category
  /* "LIVE_ACTION" */ val `5_`: typings.nyaapi.mod.pantsu.Category.`5_` & String = js.native
  
  @js.native
  sealed trait `5_10`
    extends StObject
       with Category
  /* "LIVE_ACTION_IDOL_PV" */ val `5_10`: typings.nyaapi.mod.pantsu.Category.`5_10` & String = js.native
  
  @js.native
  sealed trait `5_11`
    extends StObject
       with Category
  /* "LIVE_ACTION_RAW" */ val `5_11`: typings.nyaapi.mod.pantsu.Category.`5_11` & String = js.native
  
  @js.native
  sealed trait `5_18`
    extends StObject
       with Category
  /* "LIVE_ACTION_NON_ENGLISH" */ val `5_18`: typings.nyaapi.mod.pantsu.Category.`5_18` & String = js.native
  
  @js.native
  sealed trait `5_9`
    extends StObject
       with Category
  /* "LIVE_ACTION_ENGLISH" */ val `5_9`: typings.nyaapi.mod.pantsu.Category.`5_9` & String = js.native
  
  @js.native
  sealed trait `6_`
    extends StObject
       with Category
  /* "PICTURES" */ val `6_`: typings.nyaapi.mod.pantsu.Category.`6_` & String = js.native
  
  @js.native
  sealed trait `6_15`
    extends StObject
       with Category
  /* "PICTURES_GRAPHICS" */ val `6_15`: typings.nyaapi.mod.pantsu.Category.`6_15` & String = js.native
  
  @js.native
  sealed trait `6_16`
    extends StObject
       with Category
  /* "PICTURES_PHOTOS" */ val `6_16`: typings.nyaapi.mod.pantsu.Category.`6_16` & String = js.native
  
  @js.native
  sealed trait _underscore
    extends StObject
       with Category
  /* "ALL" */ val _underscore: typings.nyaapi.mod.pantsu.Category._underscore & String = js.native
}
