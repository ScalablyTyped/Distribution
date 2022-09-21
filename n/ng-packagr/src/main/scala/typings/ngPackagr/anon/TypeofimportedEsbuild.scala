package typings.ngPackagr.anon

import typings.esbuild.anon.BuildIncrementalmetafileM
import typings.esbuild.anon.BuildOptionsincrementaltr
import typings.esbuild.anon.BuildOptionsincrementaltrAbsWorkingDir
import typings.esbuild.anon.BuildOptionsmetafiletrue
import typings.esbuild.anon.BuildOptionswritefalse
import typings.esbuild.anon.BuildResultmetafileMetafi
import typings.esbuild.anon.BuildResultoutputFilesArr
import typings.esbuild.mod.AnalyzeMetafileOptions
import typings.esbuild.mod.BuildIncremental
import typings.esbuild.mod.BuildOptions
import typings.esbuild.mod.BuildResult
import typings.esbuild.mod.FormatMessagesOptions
import typings.esbuild.mod.InitializeOptions
import typings.esbuild.mod.Metafile
import typings.esbuild.mod.PartialMessage
import typings.esbuild.mod.ServeOptions
import typings.esbuild.mod.ServeResult
import typings.esbuild.mod.TransformOptions
import typings.esbuild.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedEsbuild extends StObject {
  
  def analyzeMetafile(metafile: String): js.Promise[String] = js.native
  def analyzeMetafile(metafile: String, options: AnalyzeMetafileOptions): js.Promise[String] = js.native
  def analyzeMetafile(metafile: Metafile): js.Promise[String] = js.native
  def analyzeMetafile(metafile: Metafile, options: AnalyzeMetafileOptions): js.Promise[String] = js.native
  
  def analyzeMetafileSync(metafile: String): String = js.native
  def analyzeMetafileSync(metafile: String, options: AnalyzeMetafileOptions): String = js.native
  def analyzeMetafileSync(metafile: Metafile): String = js.native
  def analyzeMetafileSync(metafile: Metafile, options: AnalyzeMetafileOptions): String = js.native
  
  def build(options: BuildOptionsincrementaltr): js.Promise[BuildIncremental] = js.native
  def build(options: BuildOptionsincrementaltrAbsWorkingDir): js.Promise[BuildIncrementalmetafileM] = js.native
  def build(options: BuildOptionsmetafiletrue): js.Promise[BuildResultmetafileMetafi] = js.native
  def build(options: BuildOptionswritefalse): js.Promise[BuildResultoutputFilesArr] = js.native
  def build(options: BuildOptions): js.Promise[BuildResult] = js.native
  
  def buildSync(options: BuildOptionswritefalse): BuildResultoutputFilesArr = js.native
  def buildSync(options: BuildOptions): BuildResult = js.native
  
  def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]] = js.native
  
  def formatMessagesSync(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Array[String] = js.native
  
  def initialize(options: InitializeOptions): js.Promise[Unit] = js.native
  
  def serve(serveOptions: ServeOptions, buildOptions: BuildOptions): js.Promise[ServeResult] = js.native
  
  def transform(input: String): js.Promise[TransformResult] = js.native
  def transform(input: String, options: TransformOptions): js.Promise[TransformResult] = js.native
  def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult] = js.native
  def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult] = js.native
  
  def transformSync(input: String): TransformResult = js.native
  def transformSync(input: String, options: TransformOptions): TransformResult = js.native
  
  var version: String = js.native
}
