package typings.nodePdftk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pdftk", "PDFTK")
@js.native
class PDFTK protected () extends js.Object {
  /**
    * PdfTk constructor.
    */
  def this(src: js.Array[String]) = this()
  def allow(perms: js.Array[Permission]): this.type = js.native
  /**
    * Set permissions for a PDF. By not passing in the "perms" parameter, you are disabling all features.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-perms}
    */
  def allow(perms: Permission): this.type = js.native
  /**
    * Attach files to PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-attach} for more information.
    */
  def attachFiles(files: String): this.type = js.native
  def attachFiles(files: js.Array[String]): this.type = js.native
  /**
    * Applies a PDF watermark to the background of a single PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-background}
    */
  def background(file: String): this.type = js.native
  def background(file: Buffer): this.type = js.native
  def burst(): js.Promise[Buffer] = js.native
  /**
    * Splits a single PDF into individual pages.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-burst}
    */
  def burst(outputOptions: String): js.Promise[String] = js.native
  /**
    * Assembles ("concatenate") pages from input PDFs to create a new PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-cat}
    */
  def cat(command: String): this.type = js.native
  def cat(command: js.Array[String]): this.type = js.native
  /**
    * Restore page sream compression.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-compress}
    */
  def compress(): this.type = js.native
  /**
    * Always prompt when errors occur.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-ask}
    */
  def doAsk(): this.type = js.native
  /**
    * Never prompt when errors occur.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-ask}
    */
  def dontAsk(): this.type = js.native
  /**
    * Drop all XFA data.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-drop-xfa}
    */
  def dropXfa(): this.type = js.native
  /**
    * Merge PDF form fields and their data.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-flatten}
    */
  /**
    * Outputs PDF bookmarks and metadata.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data}
    */
  def dumpData(): this.type = js.native
  /**
    * Outputs PDF annotation information.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-annots}
    */
  def dumpDataAnnots(): this.type = js.native
  /**
    * Outputs form field statistics.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-fields}
    */
  def dumpDataFields(): this.type = js.native
  /**
    * Outputs form field statistics with utf-8 encoding.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-fields-utf8}
    */
  def dumpDataFieldsUtf8(): this.type = js.native
  /**
    * Outputs PDF bookmarks and metadata with utf-8 encoding.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-utf8}
    */
  def dumpDataUtf8(): this.type = js.native
  /**
    * Set 128 bit encryption.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-strength}
    */
  def encrypt128Bit(): this.type = js.native
  /**
    * Set 40 bit encryption.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-strength}
    */
  def encrypt40Bit(): this.type = js.native
  /**
    * Fill a PDF form from JSON data.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-fill-form}
    */
  def fillForm(payload: js.Object): this.type = js.native
  /**
    * Set Adobe Reader to generate new field appearances.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-need-appearances}
    */
  /**
    * Merge PDF form fields and their data.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-flatten}
    */
  def flatten(): this.type = js.native
  /**
    * Generate fdf file from input PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-generate-fdf}
    */
  def generateFdf(): this.type = js.native
  /**
    * Allows the plugin to ignore the PDFTK warnings. Useful with huge PDF files.
    */
  def ignoreWarnings(): this.type = js.native
  /**
    * Set the input password.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-input-pw}
    */
  def inputPw(password: String): this.type = js.native
  /**
    * Keep final ID when combining pages.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-keep-id}
    */
  def keepFinalId(): this.type = js.native
  /**
    * Keep first ID when combining files.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-keep-id}
    */
  def keepFirstId(): this.type = js.native
  /**
    * Same as the background operation, but applies each page of the background PDF to the corresponding page of the input PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-multibackground}
    */
  def multiBackground(file: String): this.type = js.native
  def multiBackground(file: Buffer): this.type = js.native
  /**
    * Same as the stamp operation, but applies each page of the stamp PDF to the corresponding page of the input PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-multistamp}
    */
  def multiStamp(file: String): this.type = js.native
  def multiStamp(file: Buffer): this.type = js.native
  def needAppearances(): this.type = js.native
  def output(): js.Promise[Buffer] = js.native
  def output(writeFile: String): js.Promise[Buffer] = js.native
  /**
    * Run the command.
    */
  def output(writeFile: String, outputDest: String): js.Promise[String] = js.native
  def output(writeFile: String, outputDest: String, needsOutput: Boolean): js.Promise[String] = js.native
  /**
    * Set the owner password.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-owner-pw}
    */
  def ownerPw(password: String): this.type = js.native
  /**
    * Takes a single input PDF and rotates just the specified pages.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-rotate}
    */
  def rotate(command: String): this.type = js.native
  def rotate(command: js.Array[String]): this.type = js.native
  /**
    * Collates pages from input PDF to create new PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-shuffle}
    */
  def shuffle(command: String): this.type = js.native
  def shuffle(command: js.Array[String]): this.type = js.native
  /**
    * This behaves just like the background operation except it overlays the stamp PDF page on top of the input PDF document’s pages.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-stamp}
    */
  def stamp(file: String): this.type = js.native
  def stamp(file: Buffer): this.type = js.native
  /**
    * Used with the {@link attachFiles} method to attach to a specific page.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-attach}
    */
  def toPage(pageNo: Double): this.type = js.native
  /**
    * Remove page stream compression.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-compress}
    */
  def uncompress(): this.type = js.native
  /**
    * Unpack files into an output directory. This method is not chainable, and hereby does not require
    * the output method afterwards.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-unpack} for more information.
    */
  def unpackFiles(outputDir: String): js.Promise[String] = js.native
  /**
    * Update the bookmarks and metadata of a PDF with utf-8 encoding.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-update-info}
    */
  def updateInfo(data: js.Object): this.type = js.native
  /**
    * Update the bookmarks and metadata of a PDF.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-update-info-utf8}
    */
  def updateInfoUtf8(data: js.Object): this.type = js.native
  /**
    * Set the user password.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-user-pw}
    */
  def userPw(password: String): this.type = js.native
  /**
    * Set the verbose option.
    * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-verbose}
    */
  def verbose(): this.type = js.native
}

/* static members */
@JSImport("node-pdftk", "PDFTK")
@js.native
object PDFTK extends js.Object {
  /**
    * Returns a buffer from a file.
    */
  def fileToBuffer(file: String): Buffer = js.native
  def fileToBuffer(file: Buffer): Buffer = js.native
  /**
    * Creates fdf file from JSON input.
    */
  def generateFdfFromJSON(data: js.Object): Buffer = js.native
  /**
    * Creates pdf info text file from JSON input.
    */
  def generateInfoFromJSON(data: js.Object): Buffer = js.native
  /**
    * Simple object check. Arrays not included.
    */
  def isObject(item: js.Any): Boolean = js.native
  /**
    * Simple string check.
    */
  def isString(item: js.Any): Boolean = js.native
  /**
    * Sanitizes fdf input
    */
  def sanitizeForFdf(str: String): String = js.native
  /**
    * Returns a buffer from a string.
    */
  def stringToBuffer(file: String): Buffer = js.native
  def stringToBuffer(file: String, encoding: String): Buffer = js.native
  def stringToBuffer(file: Buffer): Buffer = js.native
  def stringToBuffer(file: Buffer, encoding: String): Buffer = js.native
}

