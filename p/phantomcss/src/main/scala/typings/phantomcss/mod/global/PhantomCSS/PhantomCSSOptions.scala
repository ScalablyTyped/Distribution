package typings.phantomcss.mod.global.PhantomCSS

import typings.casperjs.mod.Casper
import typings.resemblejs.mod.OutputSettings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhantomCSSOptions extends js.Object {
  
  /**
    Don't add count number to images. If set to false (default), a filename is
    required when capturing screenshots.
    */
  var addIteratorToImage: Boolean = js.native
  
  /**
    * Don't add label to generated failure image
    */
  var addLabelToFailedImage: js.UndefOr[Boolean] = js.native
  
  /**
    A reference to a particular Casper instance. Required for SlimerJS.
    */
  var casper: js.UndefOr[Casper] = js.native
  
  /**
    Remove results directory tree after run.  Use in conjunction
    with failedComparisonsRoot to see failed comparisons.
    */
  var cleanupComparisonImages: js.UndefOr[Boolean] = js.native
  
  /**
    You might want to keep master/baseline images in a completely
    different folder to the diffs/failures.  Useful when working
    with version control systems. By default this resolves to the
    screenshotRoot folder.
    */
  var comparisonResultRoot: js.UndefOr[String] = js.native
  
  /**
    By default, failure images are put in the './failures' folder.
    If failedComparisonsRoot is set to false a separate folder will
    not be created but failure images can still be found alongside
    the original and new images.
    */
  var failedComparisonsRoot: js.UndefOr[String] = js.native
  
  /**
    * Change the output screenshot filenames for your specific
    * integration
    */
  var fileNameGetter: js.UndefOr[js.Function2[/* rootPath */ String, /* fileName */ js.UndefOr[String], String]] = js.native
  
  var hideElements: js.UndefOr[String] = js.native
  
  /**
    libraryRoot is relative to this file and must point to your phantomcss folder (not lib or node_modules). If you are using NPM, this will be './node_modules/phantomcss'.
    */
  var libraryRoot: js.UndefOr[String] = js.native
  
  /**
    Mismatch tolerance defaults to  0.05%. Increasing this value
    will decrease test coverage
    */
  var mismatchTolerance: js.UndefOr[Double] = js.native
  
  var onComplete: js.UndefOr[
    js.Function3[
      /* tests */ js.Array[PhantomCSSTest], 
      /* noOfFails */ Double, 
      /* noOfErrors */ Double, 
      Unit
    ]
  ] = js.native
  
  var onFail: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  
  /**
    Called when creating new baseline images
    */
  var onNewImage: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  
  var onPass: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  
  var onTimeout: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  
  var outputSettings: js.UndefOr[OutputSettings_] = js.native
  
  /**
    Prefix the screenshot number to the filename, instead of suffixing it
    */
  var prefixCount: js.UndefOr[Boolean] = js.native
  
  /**
    Rebase is useful when you want to create new baseline
    images without manually deleting the files
    casperjs demo/test.js --rebase
    */
  var rebase: js.UndefOr[js.Any] = js.native
  
  var screenshotRoot: js.UndefOr[String] = js.native
}
object PhantomCSSOptions {
  
  @scala.inline
  def apply(addIteratorToImage: Boolean): PhantomCSSOptions = {
    val __obj = js.Dynamic.literal(addIteratorToImage = addIteratorToImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhantomCSSOptions]
  }
  
  @scala.inline
  implicit class PhantomCSSOptionsOps[Self <: PhantomCSSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddIteratorToImage(value: Boolean): Self = this.set("addIteratorToImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLabelToFailedImage(value: Boolean): Self = this.set("addLabelToFailedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddLabelToFailedImage: Self = this.set("addLabelToFailedImage", js.undefined)
    
    @scala.inline
    def setCasper(value: Casper): Self = this.set("casper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCasper: Self = this.set("casper", js.undefined)
    
    @scala.inline
    def setCleanupComparisonImages(value: Boolean): Self = this.set("cleanupComparisonImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanupComparisonImages: Self = this.set("cleanupComparisonImages", js.undefined)
    
    @scala.inline
    def setComparisonResultRoot(value: String): Self = this.set("comparisonResultRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonResultRoot: Self = this.set("comparisonResultRoot", js.undefined)
    
    @scala.inline
    def setFailedComparisonsRoot(value: String): Self = this.set("failedComparisonsRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedComparisonsRoot: Self = this.set("failedComparisonsRoot", js.undefined)
    
    @scala.inline
    def setFileNameGetter(value: (/* rootPath */ String, /* fileName */ js.UndefOr[String]) => String): Self = this.set("fileNameGetter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileNameGetter: Self = this.set("fileNameGetter", js.undefined)
    
    @scala.inline
    def setHideElements(value: String): Self = this.set("hideElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideElements: Self = this.set("hideElements", js.undefined)
    
    @scala.inline
    def setLibraryRoot(value: String): Self = this.set("libraryRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryRoot: Self = this.set("libraryRoot", js.undefined)
    
    @scala.inline
    def setMismatchTolerance(value: Double): Self = this.set("mismatchTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMismatchTolerance: Self = this.set("mismatchTolerance", js.undefined)
    
    @scala.inline
    def setOnComplete(
      value: (/* tests */ js.Array[PhantomCSSTest], /* noOfFails */ Double, /* noOfErrors */ Double) => Unit
    ): Self = this.set("onComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnFail(value: /* test */ PhantomCSSTest => Unit): Self = this.set("onFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFail: Self = this.set("onFail", js.undefined)
    
    @scala.inline
    def setOnNewImage(value: /* test */ PhantomCSSTest => Unit): Self = this.set("onNewImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewImage: Self = this.set("onNewImage", js.undefined)
    
    @scala.inline
    def setOnPass(value: /* test */ PhantomCSSTest => Unit): Self = this.set("onPass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPass: Self = this.set("onPass", js.undefined)
    
    @scala.inline
    def setOnTimeout(value: /* test */ PhantomCSSTest => Unit): Self = this.set("onTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeout: Self = this.set("onTimeout", js.undefined)
    
    @scala.inline
    def setOutputSettings(value: OutputSettings_): Self = this.set("outputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSettings: Self = this.set("outputSettings", js.undefined)
    
    @scala.inline
    def setPrefixCount(value: Boolean): Self = this.set("prefixCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCount: Self = this.set("prefixCount", js.undefined)
    
    @scala.inline
    def setRebase(value: js.Any): Self = this.set("rebase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebase: Self = this.set("rebase", js.undefined)
    
    @scala.inline
    def setScreenshotRoot(value: String): Self = this.set("screenshotRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshotRoot: Self = this.set("screenshotRoot", js.undefined)
  }
}
