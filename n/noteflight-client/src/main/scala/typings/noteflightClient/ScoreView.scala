package typings.noteflightClient

import typings.noteflightClient.anon.KeySignaturealternateKeyK
import typings.noteflightClient.anon.UsePrinter
import typings.noteflightClient.noteflightClientStrings.audioTrack
import typings.noteflightClient.noteflightClientStrings.echo
import typings.noteflightClient.noteflightClientStrings.normal
import typings.noteflightClient.noteflightClientStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object representing the embedded Noteflight Client API.
  */
@js.native
trait ScoreView extends StObject {
  
  /**
    * To be notified of events occurring for an embedded document,
    * you must call the addEventListener(type, handler) method on an NFClient.ScoreView object,
    * specifying an event type and a callback function. This function will be called whenever an event of the given type occurs,
    * with a single argument that is a JavaScript object describing the event that occurred.
    * The special event type "any" will trigger the callback for any document event, regardless of its type.
    */
  def addEventListener[T /* <: EventType */](
    eventType: /* template literal string: ${T} */ String,
    callback: js.Function1[/* event */ NoteflightEvent[/* template literal string: ${T} */ String], Unit]
  ): Unit = js.native
  
  /**
    * Deselects all selected objects, ranges or measures in the score.
    */
  def clearSelection(): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Deletes any selected objects, staves or measures from the score.
    * Note that attempting to delete the entire score will retain a single empty measure at the start of the score.
    */
  def deleteSection(): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Gets the initial tempo of the piece.
    * @returns An integer indicating the initial tempo of the piece in beats per minute.
    */
  def getInitialTempo(): DocumentMethodPromise[Double] = js.native
  
  /**
    *  Returns the key signature of the embed's score.
    */
  def getKeySignature(): DocumentMethodPromise[KeySignature] = js.native
  
  /**
    * Gets the master gain.
    * @returns A float indicating the current master gain.
    */
  def getMasterGain(): DocumentMethodPromise[Double] = js.native
  
  /**
    * Returns the score contents in the embed client as a MusicXML string.
    */
  def getMusicXML(): DocumentMethodPromise[String] = js.native
  
  /**
    * Gets the note head size.
    * @returns An integer indicating the current note head size, in points.
    */
  def getNoteSize(): DocumentMethodPromise[Double] = js.native
  
  /**
    * Returns the score contents in the embed client as a NoteflightXML string.
    */
  def getNoteflightXML(): DocumentMethodPromise[String] = js.native
  
  /**
    *  Supplies information about the parts in the score.
    */
  def getParts(): DocumentMethodPromise[js.Array[Part]] = js.native
  
  /**
    * Returns whether the score is playing from synthesized sound or a synchronized track.
    * @returns A string: "normal" for internal synthesis,
    * "audioTrack" for a synchronized track, "silent" for no playback,
    * or "echo" for playing selection only.
    */
  def getPlaybackMode(): DocumentMethodPromise[normal | audioTrack | silent | echo] = js.native
  
  /**
    * Gets the playback speed.
    * @returns A float indicating the current playback speed adjustment, as log2(k) where k is the speed scaling factor.
    * Thus 0 indicates no speed adjustment, -1 is 50%, and +1 is 200%.
    */
  def getPlaybackSpeed(): DocumentMethodPromise[Double] = js.native
  
  /**
    * Gets the playback tempo of the initial measure of the score.
    * @returns A tempo in beats per minute.
    */
  def getPlaybackTempo(): DocumentMethodPromise[Double] = js.native
  
  /**
    * Returns a JSON-like structure describing the entire score in the embed.
    * For modifiable embeds, permits programmatic access to their contents.
    * The returned data is a copy of the score in the embed;
    * it has no live connection to the actual score. Therefore, modifying the returned objects has no effect on the embed instance's score.
    */
  def getScore(): DocumentMethodPromise[ScoreData] = js.native
  
  /**
    * Gets whether the parts are being shown transposed.
    * @returns A boolean indicating whether parts are being shown transposed.
    */
  def getTransposeParts(): DocumentMethodPromise[Boolean] = js.native
  
  /**
    * Returns an array of key signatures for each half-step transposition from concert pitch.
    * @returns A JavaScript Array of objects with a key signature property structure.
    * Additionally an optional alternateKey property may be present,
    * pointing to an alternate, enharmonic key signature that may be obtained by setting the alternateKey option when calling setTransposeParts().
    */
  def getTranspositions(): DocumentMethodPromise[js.Array[KeySignaturealternateKeyK]] = js.native
  
  /**
    * Gets the zoom factor.
    * @returns A float representing the current zoom factor.
    */
  def getZoom(): DocumentMethodPromise[Double] = js.native
  
  /**
    * Hides any currently visible position cursor.
    */
  def hidePositionCursor(): DocumentMethodPromise[Unit] = js.native
  
  /**
    *  Loads an entire MusicXML score into the embed client.
    * Usage Restrictions: This function is only available to communities that are enabled for content injection into Noteflight embeds.
    *  @param xmlString A complete MusicXML document provided as a String.
    */
  def loadMusicXML(xmlString: String): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Loads an entire NoteflightXML score into the embed client.
    * Usage Restrictions: This function is only available to communities that are enabled for content injection into Noteflight embeds.
    * @param xmlString A complete NoteflightXML document provided as a String.
    */
  def loadNoteflightXML(xmlString: String): DocumentMethodPromise[Unit] = js.native
  
  /**
    *  If called, this will mute the audio for any synced media. It's safe to call even if there is no synced media.
    */
  def muteSyncedMedia(): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Pastes a sequence of note sets into the document at a given staff, measure and metrical offset.
    * Notes will be automatically split and tied as needed to fit the metrical structure of the score, which will also extend to accommodate the pasted sequence.
    * Accidentals will be adjusted automatically.
    * @param noteSets An array of note set objects,
    * where each note set's position property is taken as relative to the starting musical position at which notes are to be pasted.
    * @param staffIndex A zero-based index of the staff in which the notes are to be pasted.
    * @param measureIndex A zero-based index of the starting measure in which the notes are to be pasted.
    * @param offset An offset within the starting measure expressed in quarter notes.
    */
  def pasteNoteSets(noteSets: js.Array[NoteSet], staffIndex: Double, measureIndex: Double, offset: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Begins playback from the measure whose zero-based index is index.
    * @param index The zero-based index of the measure at which playback is to begin.
    */
  def playFromMeasure(index: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Begins playback from the measure containing the first selected object in the score.
    */
  def playFromSelection(): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Prints the score displayed in the client.
    * @param option Print the score using a real printer or download a PDF. Available only in HTML5.
    */
  def printScore(): DocumentMethodPromise[Unit] = js.native
  def printScore(option: UsePrinter): DocumentMethodPromise[Unit] = js.native
  
  /**
    * To stop being notified of events occurring for an embedded document,
    * call the removeEventListener(type, handler) method on an NFClient.ScoreView object,
    * specifying an event type and a callback function previously provided to addEventListener().
    */
  def removeEventListener[T /* <: EventType */](
    eventType: /* template literal string: ${T} */ String,
    callback: js.Function1[/* event */ NoteflightEvent[/* template literal string: ${T} */ String], Unit]
  ): Unit = js.native
  
  /**
    * Moves synced media playback to time in seconds. Decimals are allowed.
    * @param time Seconds to advance the synced media to.
    */
  def seekTo(time: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Causes a set of objects in the document to be selected according to the URI fragment identifier given.
    * The meanings of these fragment IDs are not documented,
    * but they are guaranteed to correspond to the fragment IDs used for deep links that are generated using the "Link URL To Selection" command in the Score Editor.
    * They also correspond to the fragment IDs passed in selection-change event callbacks from an embed.
    * @param fragment A URI fragment identifier encoding a Noteflight selection. Must begin with "#".
    */
  def selectFragment(fragment: String): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Causes a contiguous run of measures in the document to be selected, starting with the measure at startIndex and ending at the measure just before endIndex.
    * If endIndex is -1, it is interpreted as the number of measures in the score.
    * @param startIndex The inclusive zero-based index of the measure that begins the selected range.
    * @param endIndex f positive, the exclusive zero-based index of the measure following the selected range.
    * If -1, this parameter is taken as the number of measures in the score, as a convenience for selecting the entire score.
    */
  def selectMeasures(startIndex: Double, endIndex: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Causes a contiguous time range in the document to be selected, covering some or all of the staves in the document.
    * The starting point of the range is defined by startIndex and startOffset, while the end is defined by endIndex and endOffset.
    * The optional staffIndices argument allows specification of a specific set of staves to be selected.
    * @param startIndex The inclusive zero-based index of the measure that begins the selected range.
    * @param startOffset The offset in quarter notes from the beginning of the start measure at which the range begins.
    * This value may range from zero to the number of quarter notes in the measure.
    * @param endIndex The zero-based index of the measure which includes the end of the selected range.
    * @param endOffset The offset in quarter notes from the beginning of the end measure at which the range ends.
    * This offset may range from zero to the number of quarter notes in the measure.
    * @param staffIndices Optional argument providing an array of zero-based staff indices, counting down from the topmost staff in the score.
    * If given, only the given staves are included in the selection.
    */
  def selectRange(startIndex: Double, startOffset: Double, endIndex: Double, endOffset: Double): DocumentMethodPromise[Unit] = js.native
  def selectRange(
    startIndex: Double,
    startOffset: Double,
    endIndex: Double,
    endOffset: Double,
    staffIndices: js.Array[Double]
  ): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Controls the behavior whereby Noteflight automatically advances the note entry location after a note is entered (the default, corresponding to an argument of true).
    * This can be selectively disabled in situations where the focus is on chord entry.
    * @param flag True if the default behavior of auto-advance on note entry is enabled.
    */
  def setAdvanceAfterNoteEntry(flag: Boolean): DocumentMethodPromise[Unit] = js.native
  
  /**
    *  Sets a background image for the score. If smaller than the score, the image will be tiled.
    * Note: in order to load an image from your a domain, the domain must allow cross-domain image data by serving a crossdomain.xml from its root.
    * See Adobe's documentation for more detail.
    *  @param imageUri The URI of the image to load.
    */
  def setBackround(imageUri: String): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets the master gain.
    * @param masterGain The gain in volume applied to all tracks in the score, with 0 indicating no gain.
    */
  def setMasterGain(masterGain: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets the note size, in points.
    * @param noteSize The note size, in points.
    */
  def setNoteSize(noteSize: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets properites of a part in the score.
    * @param partIndex The index of the part whose properties will be set (same as its index in the array returned by getParts()).
    * @param properites An object all of whose properties will be copied onto the part.
    */
  def setPartProperties(partIndex: Double, properties: Part): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Changes the playback mode setting after an embed has started and loaded its score.
    * @param mode This parameter may be used to control how playback is handled in the embed,
    * and also whether instrument sounds are downloaded or not.
    */
  def setPlaybackMode(mode: normal | audioTrack | echo | silent): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets the playback speed.
    * @param speedGain The playback speed gain. 0 indicates no gain; each increment of 1 doubles or halves the speed.
    */
  def setPlaybackSpeed(speedGain: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets the playback tempo of the initial measure of the score.
    * @param tempo The playback tempo in beats per minute.
    */
  def setPlaybackTempo(tempo: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets whether to show parts' transpositions.
    * @param transposeParts If false, the embed will show parts at concert pitch; if true, with their per-part transposition applied.
    */
  def setTransposeParts(transposeParts: Boolean): DocumentMethodPromise[Unit] = js.native
  
  /**
    *  Determines the set of parts that will be shown in the embed.
    *  @param partIndicies An array containing one or more zero-based indices of parts in the score to be shown.
    * If an empty array is given, all parts in the score are displayed.
    */
  def setVisibleParts(partIndicies: js.Array[Double]): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Sets the zoom factor.
    * @param zoomFactor A number representing the hundreds place of the zoom in percentage (1 => 100%, 2 => 200%, etc).
    */
  def setZoom(zoomFactor: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Displays a vertical position cursor at the given quarter-note offset within the given measure.
    * @param index The zero-based index of the measure at which the cursor is displayed.
    * @param offset The offset from measure start at which the cursor is displayed, in quarter notes.
    */
  def showPositionCursor(index: Double, offset: Double): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Stops any playback currently in progress.
    */
  def stopPlayback(): DocumentMethodPromise[Unit] = js.native
  
  /**
    * Applies a global transposition in semitones to the whole score or to selected parts.
    */
  def transpose(options: TransposeOptions): DocumentMethodPromise[Unit] = js.native
  
  /**
    * If called, this will unmute the audio for any synced media. It's safe to call even if there is no synced media.
    */
  def unmuteSyncedMedia(): DocumentMethodPromise[Unit] = js.native
}
