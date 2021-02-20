package typings.nodePdftk

import typings.node.Buffer
import typings.nodePdftk.anon.PartialRecordLetterstring
import typings.nodePdftk.nodePdftkBooleans.`true`
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-pdftk", "PDFTK")
  @js.native
  class PDFTK protected () extends StObject {
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
  object PDFTK {
    
    /**
      * Returns a buffer from a file.
      */
    @JSImport("node-pdftk", "PDFTK.fileToBuffer")
    @js.native
    def fileToBuffer(file: String): Buffer = js.native
    @JSImport("node-pdftk", "PDFTK.fileToBuffer")
    @js.native
    def fileToBuffer(file: Buffer): Buffer = js.native
    
    /**
      * Creates fdf file from JSON input.
      */
    @JSImport("node-pdftk", "PDFTK.generateFdfFromJSON")
    @js.native
    def generateFdfFromJSON(data: js.Object): Buffer = js.native
    
    /**
      * Creates pdf info text file from JSON input.
      */
    @JSImport("node-pdftk", "PDFTK.generateInfoFromJSON")
    @js.native
    def generateInfoFromJSON(data: js.Object): Buffer = js.native
    
    /**
      * Simple object check. Arrays not included.
      */
    @JSImport("node-pdftk", "PDFTK.isObject")
    @js.native
    def isObject(item: js.Any): Boolean = js.native
    
    /**
      * Simple string check.
      */
    @JSImport("node-pdftk", "PDFTK.isString")
    @js.native
    def isString(item: js.Any): Boolean = js.native
    
    /**
      * Sanitizes fdf input
      */
    @JSImport("node-pdftk", "PDFTK.sanitizeForFdf")
    @js.native
    def sanitizeForFdf(str: String): String = js.native
    
    /**
      * Returns a buffer from a string.
      */
    @JSImport("node-pdftk", "PDFTK.stringToBuffer")
    @js.native
    def stringToBuffer(file: String): Buffer = js.native
    @JSImport("node-pdftk", "PDFTK.stringToBuffer")
    @js.native
    def stringToBuffer(file: String, encoding: String): Buffer = js.native
    @JSImport("node-pdftk", "PDFTK.stringToBuffer")
    @js.native
    def stringToBuffer(file: Buffer): Buffer = js.native
    @JSImport("node-pdftk", "PDFTK.stringToBuffer")
    @js.native
    def stringToBuffer(file: Buffer, encoding: String): Buffer = js.native
  }
  
  @JSImport("node-pdftk", "configure")
  @js.native
  def configure(opts: ConfigureOptions): Unit = js.native
  
  @JSImport("node-pdftk", "input")
  @js.native
  def input(file: String): PDFTK = js.native
  @JSImport("node-pdftk", "input")
  @js.native
  def input(file: js.Array[Buffer]): PDFTK = js.native
  @JSImport("node-pdftk", "input")
  @js.native
  def input(file: Buffer): PDFTK = js.native
  @JSImport("node-pdftk", "input")
  @js.native
  def input(file: PartialRecordLetterstring): PDFTK = js.native
  
  @js.native
  trait ConfigureOptions extends StObject {
    
    var Promise: PromiseConstructor = js.native
    
    var bin: String = js.native
    
    var ignoreWarnings: `true` = js.native
    
    var tempDir: String = js.native
  }
  object ConfigureOptions {
    
    @scala.inline
    def apply(Promise: PromiseConstructor, bin: String, ignoreWarnings: `true`, tempDir: String): ConfigureOptions = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], ignoreWarnings = ignoreWarnings.asInstanceOf[js.Any], tempDir = tempDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    @scala.inline
    implicit class ConfigureOptionsMutableBuilder[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWarnings(value: `true`): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDir(value: String): Self = StObject.set(x, "tempDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePdftk.nodePdftkStrings.A
    - typings.nodePdftk.nodePdftkStrings.B
    - typings.nodePdftk.nodePdftkStrings.C
    - typings.nodePdftk.nodePdftkStrings.D
    - typings.nodePdftk.nodePdftkStrings.E
    - typings.nodePdftk.nodePdftkStrings.F
    - typings.nodePdftk.nodePdftkStrings.G
    - typings.nodePdftk.nodePdftkStrings.H
    - typings.nodePdftk.nodePdftkStrings.I
    - typings.nodePdftk.nodePdftkStrings.J
    - typings.nodePdftk.nodePdftkStrings.K
    - typings.nodePdftk.nodePdftkStrings.L
    - typings.nodePdftk.nodePdftkStrings.M
    - typings.nodePdftk.nodePdftkStrings.N
    - typings.nodePdftk.nodePdftkStrings.O
    - typings.nodePdftk.nodePdftkStrings.P
    - typings.nodePdftk.nodePdftkStrings.Q
    - typings.nodePdftk.nodePdftkStrings.R
    - typings.nodePdftk.nodePdftkStrings.S
    - typings.nodePdftk.nodePdftkStrings.T
    - typings.nodePdftk.nodePdftkStrings.U
    - typings.nodePdftk.nodePdftkStrings.V
    - typings.nodePdftk.nodePdftkStrings.W
    - typings.nodePdftk.nodePdftkStrings.X
    - typings.nodePdftk.nodePdftkStrings.Y
    - typings.nodePdftk.nodePdftkStrings.Z
  */
  trait Letter extends StObject
  object Letter {
    
    @scala.inline
    def A: typings.nodePdftk.nodePdftkStrings.A = "A".asInstanceOf[typings.nodePdftk.nodePdftkStrings.A]
    
    @scala.inline
    def B: typings.nodePdftk.nodePdftkStrings.B = "B".asInstanceOf[typings.nodePdftk.nodePdftkStrings.B]
    
    @scala.inline
    def C: typings.nodePdftk.nodePdftkStrings.C = "C".asInstanceOf[typings.nodePdftk.nodePdftkStrings.C]
    
    @scala.inline
    def D: typings.nodePdftk.nodePdftkStrings.D = "D".asInstanceOf[typings.nodePdftk.nodePdftkStrings.D]
    
    @scala.inline
    def E: typings.nodePdftk.nodePdftkStrings.E = "E".asInstanceOf[typings.nodePdftk.nodePdftkStrings.E]
    
    @scala.inline
    def F: typings.nodePdftk.nodePdftkStrings.F = "F".asInstanceOf[typings.nodePdftk.nodePdftkStrings.F]
    
    @scala.inline
    def G: typings.nodePdftk.nodePdftkStrings.G = "G".asInstanceOf[typings.nodePdftk.nodePdftkStrings.G]
    
    @scala.inline
    def H: typings.nodePdftk.nodePdftkStrings.H = "H".asInstanceOf[typings.nodePdftk.nodePdftkStrings.H]
    
    @scala.inline
    def I: typings.nodePdftk.nodePdftkStrings.I = "I".asInstanceOf[typings.nodePdftk.nodePdftkStrings.I]
    
    @scala.inline
    def J: typings.nodePdftk.nodePdftkStrings.J = "J".asInstanceOf[typings.nodePdftk.nodePdftkStrings.J]
    
    @scala.inline
    def K: typings.nodePdftk.nodePdftkStrings.K = "K".asInstanceOf[typings.nodePdftk.nodePdftkStrings.K]
    
    @scala.inline
    def L: typings.nodePdftk.nodePdftkStrings.L = "L".asInstanceOf[typings.nodePdftk.nodePdftkStrings.L]
    
    @scala.inline
    def M: typings.nodePdftk.nodePdftkStrings.M = "M".asInstanceOf[typings.nodePdftk.nodePdftkStrings.M]
    
    @scala.inline
    def N: typings.nodePdftk.nodePdftkStrings.N = "N".asInstanceOf[typings.nodePdftk.nodePdftkStrings.N]
    
    @scala.inline
    def O: typings.nodePdftk.nodePdftkStrings.O = "O".asInstanceOf[typings.nodePdftk.nodePdftkStrings.O]
    
    @scala.inline
    def P: typings.nodePdftk.nodePdftkStrings.P = "P".asInstanceOf[typings.nodePdftk.nodePdftkStrings.P]
    
    @scala.inline
    def Q: typings.nodePdftk.nodePdftkStrings.Q = "Q".asInstanceOf[typings.nodePdftk.nodePdftkStrings.Q]
    
    @scala.inline
    def R: typings.nodePdftk.nodePdftkStrings.R = "R".asInstanceOf[typings.nodePdftk.nodePdftkStrings.R]
    
    @scala.inline
    def S: typings.nodePdftk.nodePdftkStrings.S = "S".asInstanceOf[typings.nodePdftk.nodePdftkStrings.S]
    
    @scala.inline
    def T: typings.nodePdftk.nodePdftkStrings.T = "T".asInstanceOf[typings.nodePdftk.nodePdftkStrings.T]
    
    @scala.inline
    def U: typings.nodePdftk.nodePdftkStrings.U = "U".asInstanceOf[typings.nodePdftk.nodePdftkStrings.U]
    
    @scala.inline
    def V: typings.nodePdftk.nodePdftkStrings.V = "V".asInstanceOf[typings.nodePdftk.nodePdftkStrings.V]
    
    @scala.inline
    def W: typings.nodePdftk.nodePdftkStrings.W = "W".asInstanceOf[typings.nodePdftk.nodePdftkStrings.W]
    
    @scala.inline
    def X: typings.nodePdftk.nodePdftkStrings.X = "X".asInstanceOf[typings.nodePdftk.nodePdftkStrings.X]
    
    @scala.inline
    def Y: typings.nodePdftk.nodePdftkStrings.Y = "Y".asInstanceOf[typings.nodePdftk.nodePdftkStrings.Y]
    
    @scala.inline
    def Z: typings.nodePdftk.nodePdftkStrings.Z = "Z".asInstanceOf[typings.nodePdftk.nodePdftkStrings.Z]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePdftk.nodePdftkStrings.Printing
    - typings.nodePdftk.nodePdftkStrings.DegradedPrintin
    - typings.nodePdftk.nodePdftkStrings.ModifyContents
    - typings.nodePdftk.nodePdftkStrings.Assembly
    - typings.nodePdftk.nodePdftkStrings.CopyContents
    - typings.nodePdftk.nodePdftkStrings.ScreenReaders
    - typings.nodePdftk.nodePdftkStrings.ModifyAnnotations
    - typings.nodePdftk.nodePdftkStrings.FillIn
    - typings.nodePdftk.nodePdftkStrings.AllFeatures
  */
  trait Permission extends StObject
  object Permission {
    
    @scala.inline
    def AllFeatures: typings.nodePdftk.nodePdftkStrings.AllFeatures = "AllFeatures".asInstanceOf[typings.nodePdftk.nodePdftkStrings.AllFeatures]
    
    @scala.inline
    def Assembly: typings.nodePdftk.nodePdftkStrings.Assembly = "Assembly".asInstanceOf[typings.nodePdftk.nodePdftkStrings.Assembly]
    
    @scala.inline
    def CopyContents: typings.nodePdftk.nodePdftkStrings.CopyContents = "CopyContents".asInstanceOf[typings.nodePdftk.nodePdftkStrings.CopyContents]
    
    @scala.inline
    def DegradedPrintin: typings.nodePdftk.nodePdftkStrings.DegradedPrintin = "DegradedPrintin".asInstanceOf[typings.nodePdftk.nodePdftkStrings.DegradedPrintin]
    
    @scala.inline
    def FillIn: typings.nodePdftk.nodePdftkStrings.FillIn = "FillIn".asInstanceOf[typings.nodePdftk.nodePdftkStrings.FillIn]
    
    @scala.inline
    def ModifyAnnotations: typings.nodePdftk.nodePdftkStrings.ModifyAnnotations = "ModifyAnnotations".asInstanceOf[typings.nodePdftk.nodePdftkStrings.ModifyAnnotations]
    
    @scala.inline
    def ModifyContents: typings.nodePdftk.nodePdftkStrings.ModifyContents = "ModifyContents".asInstanceOf[typings.nodePdftk.nodePdftkStrings.ModifyContents]
    
    @scala.inline
    def Printing: typings.nodePdftk.nodePdftkStrings.Printing = "Printing".asInstanceOf[typings.nodePdftk.nodePdftkStrings.Printing]
    
    @scala.inline
    def ScreenReaders: typings.nodePdftk.nodePdftkStrings.ScreenReaders = "ScreenReaders".asInstanceOf[typings.nodePdftk.nodePdftkStrings.ScreenReaders]
  }
}
