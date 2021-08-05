package typings.musicmatch

import typings.musicmatch.mod.TFormat
import typings.musicmatch.mod.TSort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicmatchStrings {
  
  @js.native
  sealed trait asc
    extends StObject
       with TSort
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait bad_characters extends StObject
  inline def bad_characters: bad_characters = "bad_characters".asInstanceOf[bad_characters]
  
  @js.native
  sealed trait desc
    extends StObject
       with TSort
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait dfxp extends StObject
  inline def dfxp: dfxp = "dfxp".asInstanceOf[dfxp]
  
  @js.native
  sealed trait json
    extends StObject
       with TFormat
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait lines_too_long extends StObject
  inline def lines_too_long: lines_too_long = "lines_too_long".asInstanceOf[lines_too_long]
  
  @js.native
  sealed trait lrc extends StObject
  inline def lrc: lrc = "lrc".asInstanceOf[lrc]
  
  @js.native
  sealed trait stledu extends StObject
  inline def stledu: stledu = "stledu".asInstanceOf[stledu]
  
  @js.native
  sealed trait wrong_attribution extends StObject
  inline def wrong_attribution: wrong_attribution = "wrong_attribution".asInstanceOf[wrong_attribution]
  
  @js.native
  sealed trait wrong_formatting extends StObject
  inline def wrong_formatting: wrong_formatting = "wrong_formatting".asInstanceOf[wrong_formatting]
  
  @js.native
  sealed trait wrong_lyrics extends StObject
  inline def wrong_lyrics: wrong_lyrics = "wrong_lyrics".asInstanceOf[wrong_lyrics]
  
  @js.native
  sealed trait wrong_verses extends StObject
  inline def wrong_verses: wrong_verses = "wrong_verses".asInstanceOf[wrong_verses]
  
  @js.native
  sealed trait xml
    extends StObject
       with TFormat
  inline def xml: xml = "xml".asInstanceOf[xml]
}
