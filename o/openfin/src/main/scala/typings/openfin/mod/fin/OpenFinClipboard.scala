package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clipboard
  * Clipboard API allows reading and writting to the clipboard in multiple formats.
  */
@js.native
trait OpenFinClipboard extends StObject {
  
  /**
    * Reads available formats for the clipboard type
    */
  def availableFormats(): Unit = js.native
  def availableFormats(`type`: String): Unit = js.native
  def availableFormats(`type`: String, callback: js.Function1[/* formats */ js.Array[String], Unit]): Unit = js.native
  def availableFormats(
    `type`: String,
    callback: js.Function1[/* formats */ js.Array[String], Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def availableFormats(
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def availableFormats(`type`: Null, callback: js.Function1[/* formats */ js.Array[String], Unit]): Unit = js.native
  def availableFormats(
    `type`: Null,
    callback: js.Function1[/* formats */ js.Array[String], Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def availableFormats(
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Reads available formats for the clipboard type
    */
  def readHtml(): Unit = js.native
  def readHtml(`type`: String): Unit = js.native
  def readHtml(`type`: String, callback: js.Function1[/* html */ String, Unit]): Unit = js.native
  def readHtml(
    `type`: String,
    callback: js.Function1[/* html */ String, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readHtml(
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readHtml(`type`: Null, callback: js.Function1[/* html */ String, Unit]): Unit = js.native
  def readHtml(
    `type`: Null,
    callback: js.Function1[/* html */ String, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readHtml(
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Read the content of the clipboard as Rtf
    */
  def readRtf(): Unit = js.native
  def readRtf(`type`: String): Unit = js.native
  def readRtf(`type`: String, callback: js.Function1[/* rtf */ String, Unit]): Unit = js.native
  def readRtf(
    `type`: String,
    callback: js.Function1[/* rtf */ String, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readRtf(
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readRtf(`type`: Null, callback: js.Function1[/* rtf */ String, Unit]): Unit = js.native
  def readRtf(
    `type`: Null,
    callback: js.Function1[/* rtf */ String, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readRtf(
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Read the content of the clipboard as plain text
    */
  def readText(): Unit = js.native
  def readText(`type`: String): Unit = js.native
  def readText(`type`: String, callback: js.Function1[/* text */ String, Unit]): Unit = js.native
  def readText(
    `type`: String,
    callback: js.Function1[/* text */ String, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readText(
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readText(`type`: Null, callback: js.Function1[/* text */ String, Unit]): Unit = js.native
  def readText(
    `type`: Null,
    callback: js.Function1[/* text */ String, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def readText(
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Writes data into the clipboard
    */
  def write(data: js.Any): Unit = js.native
  def write(data: js.Any, `type`: String): Unit = js.native
  def write(data: js.Any, `type`: String, callback: js.Function0[Unit]): Unit = js.native
  def write(
    data: js.Any,
    `type`: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def write(
    data: js.Any,
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def write(data: js.Any, `type`: Null, callback: js.Function0[Unit]): Unit = js.native
  def write(
    data: js.Any,
    `type`: Null,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def write(
    data: js.Any,
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Writes data into the clipboard as Html
    */
  def writeHtml(data: String): Unit = js.native
  def writeHtml(data: String, `type`: String): Unit = js.native
  def writeHtml(data: String, `type`: String, callback: js.Function0[Unit]): Unit = js.native
  def writeHtml(
    data: String,
    `type`: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeHtml(
    data: String,
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeHtml(data: String, `type`: Null, callback: js.Function0[Unit]): Unit = js.native
  def writeHtml(
    data: String,
    `type`: Null,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeHtml(
    data: String,
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Writes data into the clipboard as Rtf
    */
  def writeRtf(data: String): Unit = js.native
  def writeRtf(data: String, `type`: String): Unit = js.native
  def writeRtf(data: String, `type`: String, callback: js.Function0[Unit]): Unit = js.native
  def writeRtf(
    data: String,
    `type`: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeRtf(
    data: String,
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeRtf(data: String, `type`: Null, callback: js.Function0[Unit]): Unit = js.native
  def writeRtf(
    data: String,
    `type`: Null,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeRtf(
    data: String,
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Writes data into the clipboard as plain text
    */
  def writeText(data: String): Unit = js.native
  def writeText(data: String, `type`: String): Unit = js.native
  def writeText(data: String, `type`: String, callback: js.Function0[Unit]): Unit = js.native
  def writeText(
    data: String,
    `type`: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeText(
    data: String,
    `type`: String,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeText(data: String, `type`: Null, callback: js.Function0[Unit]): Unit = js.native
  def writeText(
    data: String,
    `type`: Null,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def writeText(
    data: String,
    `type`: Null,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
}
