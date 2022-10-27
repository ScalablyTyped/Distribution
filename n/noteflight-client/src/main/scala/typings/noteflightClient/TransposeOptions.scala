package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransposeOptions extends StObject {
  
  /**
    * if true, uses alternate enharmonic key spellings reported by getTranspositions() for this pitch change.
    */
  var alternateKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, hide chord symbols after transposing.
    */
  var hideChordSymbols: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, hide fretbroards after transposing.
    */
  var hideFretboards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, suppresses any forced slur directions in the score.
    */
  var ignoreSlurDirection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, suppresses any forced stem directions in the score.
    */
  var ignoreStemDirection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 	An array each of whose elements corresponds to a part in the score and supplies the number of semitones by which to transpose that part.
    */
  var partSemitones: js.Array[Double]
  
  /**
    * if true, automatically resumes playback of the currently playing measure following transposition.
    */
  var resumePlayback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An integral number of semitones to transpose the whole score.
    */
  var semitones: Double
}
object TransposeOptions {
  
  inline def apply(partSemitones: js.Array[Double], semitones: Double): TransposeOptions = {
    val __obj = js.Dynamic.literal(partSemitones = partSemitones.asInstanceOf[js.Any], semitones = semitones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransposeOptions]
  }
  
  extension [Self <: TransposeOptions](x: Self) {
    
    inline def setAlternateKey(value: Boolean): Self = StObject.set(x, "alternateKey", value.asInstanceOf[js.Any])
    
    inline def setAlternateKeyUndefined: Self = StObject.set(x, "alternateKey", js.undefined)
    
    inline def setHideChordSymbols(value: Boolean): Self = StObject.set(x, "hideChordSymbols", value.asInstanceOf[js.Any])
    
    inline def setHideChordSymbolsUndefined: Self = StObject.set(x, "hideChordSymbols", js.undefined)
    
    inline def setHideFretboards(value: Boolean): Self = StObject.set(x, "hideFretboards", value.asInstanceOf[js.Any])
    
    inline def setHideFretboardsUndefined: Self = StObject.set(x, "hideFretboards", js.undefined)
    
    inline def setIgnoreSlurDirection(value: Boolean): Self = StObject.set(x, "ignoreSlurDirection", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSlurDirectionUndefined: Self = StObject.set(x, "ignoreSlurDirection", js.undefined)
    
    inline def setIgnoreStemDirection(value: Boolean): Self = StObject.set(x, "ignoreStemDirection", value.asInstanceOf[js.Any])
    
    inline def setIgnoreStemDirectionUndefined: Self = StObject.set(x, "ignoreStemDirection", js.undefined)
    
    inline def setPartSemitones(value: js.Array[Double]): Self = StObject.set(x, "partSemitones", value.asInstanceOf[js.Any])
    
    inline def setPartSemitonesVarargs(value: Double*): Self = StObject.set(x, "partSemitones", js.Array(value*))
    
    inline def setResumePlayback(value: Boolean): Self = StObject.set(x, "resumePlayback", value.asInstanceOf[js.Any])
    
    inline def setResumePlaybackUndefined: Self = StObject.set(x, "resumePlayback", js.undefined)
    
    inline def setSemitones(value: Double): Self = StObject.set(x, "semitones", value.asInstanceOf[js.Any])
  }
}
