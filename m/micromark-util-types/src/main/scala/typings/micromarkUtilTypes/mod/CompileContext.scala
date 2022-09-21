package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.PickTokenstartend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileContext extends StObject {
  
  /**
    *   Capture some of the output data.
    */
  def buffer(): Unit = js.native
  
  /**
    *   Make a value safe for injection in HTML (except w/ `ignoreEncode`).
    */
  def encode(value: String): String = js.native
  
  /**
    *   Get data from the key-value store.
    */
  def getData[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[K] */ js.Any = js.native
  
  /**
    *   Output an extra line ending if the previous value wasn’t EOF/EOL.
    */
  def lineEndingIfNeeded(): Unit = js.native
  
  /**
    *   Configuration passed by the user.
    */
  var options: CompileOptions = js.native
  
  /**
    *   Output raw data.
    */
  def raw(value: String): Unit = js.native
  
  /**
    *   Stop capturing and access the output data.
    */
  def resume(): String = js.native
  
  /**
    *   Set data into the key-value store.
    */
  def setData(key: String): Unit = js.native
  def setData(key: String, value: Any): Unit = js.native
  
  /**
    *   Get the string value of a token
    */
  def sliceSerialize(token: PickTokenstartend): String = js.native
  def sliceSerialize(token: PickTokenstartend, expandTabs: Boolean): String = js.native
  /**
    *   Get the string value of a token
    */
  @JSName("sliceSerialize")
  var sliceSerialize_Original: js.Function2[/* token */ PickTokenstartend, /* expandTabs */ js.UndefOr[Boolean], String] = js.native
  
  /**
    *   Output (parts of) HTML tags.
    */
  def tag(value: String): Unit = js.native
}
