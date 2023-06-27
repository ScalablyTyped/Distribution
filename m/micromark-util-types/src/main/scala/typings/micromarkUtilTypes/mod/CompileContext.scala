package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.PickTokenendstart
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.characterReferenceType
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.definitions
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.expectFirstItem
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.fencedCodeInside
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.fencesCount
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.flowCodeSeenData
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.headingRank
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.ignoreEncode
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.inCodeText
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.lastWasTag
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.slurpAllLineEndings
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.slurpOneLineEnding
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.tightStack
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileContext extends StObject {
  
  /**
    * Capture some of the output data.
    *
    * @returns
    *   Nothing.
    */
  def buffer(): Unit = js.native
  
  /**
    * Make a value safe for injection in HTML (except w/ `ignoreEncode`).
    *
    * @param value
    *   Raw value.
    * @returns
    *   Safe value.
    */
  def encode(value: String): String = js.native
  
  @JSName("getData")
  def getData_characterReferenceType(key: characterReferenceType): js.UndefOr[String] = js.native
  @JSName("getData")
  def getData_definitions(key: definitions): Record[String, Definition] = js.native
  @JSName("getData")
  def getData_expectFirstItem(key: expectFirstItem): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_fencedCodeInside(key: fencedCodeInside): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_fencesCount(key: fencesCount): js.UndefOr[Double] = js.native
  @JSName("getData")
  def getData_flowCodeSeenData(key: flowCodeSeenData): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_headingRank(key: headingRank): js.UndefOr[Double] = js.native
  @JSName("getData")
  def getData_ignoreEncode(key: ignoreEncode): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_inCodeText(key: inCodeText): js.UndefOr[Boolean] = js.native
  /**
    * Get data from the key-value store.
    *
    * @param key
    *   Key.
    * @returns
    *   Value at `key` in compile data.
    */
  @JSName("getData")
  def getData_lastWasTag(key: lastWasTag): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_slurpAllLineEndings(key: slurpAllLineEndings): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_slurpOneLineEnding(key: slurpOneLineEnding): js.UndefOr[Boolean] = js.native
  @JSName("getData")
  def getData_tightStack(key: tightStack): js.Array[Boolean] = js.native
  
  /**
    * Output an extra line ending if the previous value wasn’t EOF/EOL.
    *
    * @returns
    *   Nothing.
    */
  def lineEndingIfNeeded(): Unit = js.native
  
  /**
    * Configuration passed by the user.
    */
  var options: CompileOptions = js.native
  
  /**
    * Output raw data.
    *
    * @param value
    *   Raw value.
    * @returns
    *   Nothing.
    */
  def raw(value: String): Unit = js.native
  
  /**
    * Stop capturing and access the output data.
    *
    * @returns
    *   Captured data.
    */
  def resume(): String = js.native
  
  @JSName("setData")
  def setData_characterReferenceType(key: characterReferenceType): Unit = js.native
  @JSName("setData")
  def setData_characterReferenceType(key: characterReferenceType, value: js.UndefOr[String]): Unit = js.native
  @JSName("setData")
  def setData_definitions(key: definitions): Unit = js.native
  @JSName("setData")
  def setData_definitions(key: definitions, value: Record[String, Definition]): Unit = js.native
  @JSName("setData")
  def setData_expectFirstItem(key: expectFirstItem): Unit = js.native
  @JSName("setData")
  def setData_expectFirstItem(key: expectFirstItem, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_fencedCodeInside(key: fencedCodeInside): Unit = js.native
  @JSName("setData")
  def setData_fencedCodeInside(key: fencedCodeInside, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_fencesCount(key: fencesCount): Unit = js.native
  @JSName("setData")
  def setData_fencesCount(key: fencesCount, value: js.UndefOr[Double]): Unit = js.native
  @JSName("setData")
  def setData_flowCodeSeenData(key: flowCodeSeenData): Unit = js.native
  @JSName("setData")
  def setData_flowCodeSeenData(key: flowCodeSeenData, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_headingRank(key: headingRank): Unit = js.native
  @JSName("setData")
  def setData_headingRank(key: headingRank, value: js.UndefOr[Double]): Unit = js.native
  @JSName("setData")
  def setData_ignoreEncode(key: ignoreEncode): Unit = js.native
  @JSName("setData")
  def setData_ignoreEncode(key: ignoreEncode, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_inCodeText(key: inCodeText): Unit = js.native
  @JSName("setData")
  def setData_inCodeText(key: inCodeText, value: js.UndefOr[Boolean]): Unit = js.native
  /**
    * Set data into the key-value store.
    *
    * @param key
    *   Key.
    * @param value
    *   Value.
    * @returns
    *   Nothing.
    */
  @JSName("setData")
  def setData_lastWasTag(key: lastWasTag): Unit = js.native
  @JSName("setData")
  def setData_lastWasTag(key: lastWasTag, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_slurpAllLineEndings(key: slurpAllLineEndings): Unit = js.native
  @JSName("setData")
  def setData_slurpAllLineEndings(key: slurpAllLineEndings, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_slurpOneLineEnding(key: slurpOneLineEnding): Unit = js.native
  @JSName("setData")
  def setData_slurpOneLineEnding(key: slurpOneLineEnding, value: js.UndefOr[Boolean]): Unit = js.native
  @JSName("setData")
  def setData_tightStack(key: tightStack): Unit = js.native
  @JSName("setData")
  def setData_tightStack(key: tightStack, value: js.Array[Boolean]): Unit = js.native
  
  /**
    * Get the string value of a token.
    *
    * @param token
    *   Start/end in stream.
    * @param expandTabs
    *   Whether to expand tabs.
    * @returns
    *   Serialized chunks.
    */
  def sliceSerialize(token: PickTokenendstart): String = js.native
  def sliceSerialize(token: PickTokenendstart, expandTabs: Boolean): String = js.native
  /**
    * Get the string value of a token.
    *
    * @param token
    *   Start/end in stream.
    * @param expandTabs
    *   Whether to expand tabs.
    * @returns
    *   Serialized chunks.
    */
  @JSName("sliceSerialize")
  var sliceSerialize_Original: js.Function2[/* token */ PickTokenendstart, /* expandTabs */ js.UndefOr[Boolean], String] = js.native
  
  /**
    * Output (parts of) HTML tags.
    *
    * @param value
    *   Raw value.
    * @returns
    *   Nothing.
    */
  def tag(value: String): Unit = js.native
}
