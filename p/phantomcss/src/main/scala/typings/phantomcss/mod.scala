package typings.phantomcss

import typings.casperjs.mod.Casper
import typings.phantomjs.ClipRect
import typings.resemblejs.mod.OutputSettings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object PhantomCSS {
      
      @js.native
      trait PhantomCSS extends StObject {
        
        def compareAll(exclude: String): Unit = js.native
        def compareAll(exclude: String, diffList: js.Array[String], include: String): Unit = js.native
        
        /**
          * Explicitly define what files you want to compare
          */
        def compareExplicit(list: js.Array[String]): Unit = js.native
        
        def compareFiles(baseFile: String, diffFiles: String): PhantomCSSTest = js.native
        
        def compareMatched(`match`: String, exclude: String): Unit = js.native
        def compareMatched(`match`: js.RegExp, exclude: js.RegExp): Unit = js.native
        
        /**
          * Compare image diffs generated in this test run only
          */
        def compareSession(): Unit = js.native
        def compareSession(list: js.Array[Any]): Unit = js.native
        
        def done(): Unit = js.native
        
        /**
          * Get a list of image diffs generated in this test run
          */
        def getCreatedDiffFiles(): js.Array[String] = js.native
        
        def getExitStatus(): Double = js.native
        
        def init(options: PhantomCSSOptions): Unit = js.native
        
        /**
          * Take a screenshot of the targeted HTML element
          * FileName is required if addIteratorToImage option is set to false
          */
        def screenshot(target: String): Unit = js.native
        def screenshot(target: String, fileName: String): Unit = js.native
        /**
          * Take a screenshot of the targeted HTML element
          * FileName is required if addIteratorToImage option is set to false
          */
        def screenshot(target: String, timeToWait: Double, hideSelector: String): Unit = js.native
        def screenshot(target: String, timeToWait: Double, hideSelector: String, fileName: String): Unit = js.native
        /**
          * Take a screenshot of the targeted HTML element
          * FileName is required if addIteratorToImage option is set to false
          */
        def screenshot(target: ClipRect): Unit = js.native
        def screenshot(target: ClipRect, fileName: String): Unit = js.native
        
        /**
          * Turn off CSS transitions and jQuery animations
          */
        def turnOffAnimations(): Unit = js.native
        
        def update(options: PhantomCSSOptions): Unit = js.native
        
        def waitForTests(tests: js.Array[PhantomCSSTest]): Unit = js.native
      }
      
      trait PhantomCSSOptions extends StObject {
        
        /**
          Don't add count number to images. If set to false (default), a filename is
          required when capturing screenshots.
          */
        var addIteratorToImage: Boolean
        
        /**
          * Don't add label to generated failure image
          */
        var addLabelToFailedImage: js.UndefOr[Boolean] = js.undefined
        
        /**
          A reference to a particular Casper instance. Required for SlimerJS.
          */
        var casper: js.UndefOr[Casper] = js.undefined
        
        /**
          Remove results directory tree after run.  Use in conjunction
          with failedComparisonsRoot to see failed comparisons.
          */
        var cleanupComparisonImages: js.UndefOr[Boolean] = js.undefined
        
        /**
          You might want to keep master/baseline images in a completely
          different folder to the diffs/failures.  Useful when working
          with version control systems. By default this resolves to the
          screenshotRoot folder.
          */
        var comparisonResultRoot: js.UndefOr[String] = js.undefined
        
        /**
          By default, failure images are put in the './failures' folder.
          If failedComparisonsRoot is set to false a separate folder will
          not be created but failure images can still be found alongside
          the original and new images.
          */
        var failedComparisonsRoot: js.UndefOr[String] = js.undefined
        
        /**
          * Change the output screenshot filenames for your specific
          * integration
          */
        var fileNameGetter: js.UndefOr[js.Function2[/* rootPath */ String, /* fileName */ js.UndefOr[String], String]] = js.undefined
        
        var hideElements: js.UndefOr[String] = js.undefined
        
        /**
          libraryRoot is relative to this file and must point to your phantomcss folder (not lib or node_modules). If you are using NPM, this will be './node_modules/phantomcss'.
          */
        var libraryRoot: js.UndefOr[String] = js.undefined
        
        /**
          Mismatch tolerance defaults to  0.05%. Increasing this value
          will decrease test coverage
          */
        var mismatchTolerance: js.UndefOr[Double] = js.undefined
        
        var onComplete: js.UndefOr[
                js.Function3[
                  /* tests */ js.Array[PhantomCSSTest], 
                  /* noOfFails */ Double, 
                  /* noOfErrors */ Double, 
                  Unit
                ]
              ] = js.undefined
        
        var onFail: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.undefined
        
        /**
          Called when creating new baseline images
          */
        var onNewImage: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.undefined
        
        var onPass: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.undefined
        
        var onTimeout: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.undefined
        
        var outputSettings: js.UndefOr[OutputSettings_] = js.undefined
        
        /**
          Prefix the screenshot number to the filename, instead of suffixing it
          */
        var prefixCount: js.UndefOr[Boolean] = js.undefined
        
        /**
          Rebase is useful when you want to create new baseline
          images without manually deleting the files
          casperjs demo/test.js --rebase
          */
        var rebase: js.UndefOr[Any] = js.undefined
        
        var screenshotRoot: js.UndefOr[String] = js.undefined
      }
      object PhantomCSSOptions {
        
        inline def apply(addIteratorToImage: Boolean): PhantomCSSOptions = {
          val __obj = js.Dynamic.literal(addIteratorToImage = addIteratorToImage.asInstanceOf[js.Any])
          __obj.asInstanceOf[PhantomCSSOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: PhantomCSSOptions] (val x: Self) extends AnyVal {
          
          inline def setAddIteratorToImage(value: Boolean): Self = StObject.set(x, "addIteratorToImage", value.asInstanceOf[js.Any])
          
          inline def setAddLabelToFailedImage(value: Boolean): Self = StObject.set(x, "addLabelToFailedImage", value.asInstanceOf[js.Any])
          
          inline def setAddLabelToFailedImageUndefined: Self = StObject.set(x, "addLabelToFailedImage", js.undefined)
          
          inline def setCasper(value: Casper): Self = StObject.set(x, "casper", value.asInstanceOf[js.Any])
          
          inline def setCasperUndefined: Self = StObject.set(x, "casper", js.undefined)
          
          inline def setCleanupComparisonImages(value: Boolean): Self = StObject.set(x, "cleanupComparisonImages", value.asInstanceOf[js.Any])
          
          inline def setCleanupComparisonImagesUndefined: Self = StObject.set(x, "cleanupComparisonImages", js.undefined)
          
          inline def setComparisonResultRoot(value: String): Self = StObject.set(x, "comparisonResultRoot", value.asInstanceOf[js.Any])
          
          inline def setComparisonResultRootUndefined: Self = StObject.set(x, "comparisonResultRoot", js.undefined)
          
          inline def setFailedComparisonsRoot(value: String): Self = StObject.set(x, "failedComparisonsRoot", value.asInstanceOf[js.Any])
          
          inline def setFailedComparisonsRootUndefined: Self = StObject.set(x, "failedComparisonsRoot", js.undefined)
          
          inline def setFileNameGetter(value: (/* rootPath */ String, /* fileName */ js.UndefOr[String]) => String): Self = StObject.set(x, "fileNameGetter", js.Any.fromFunction2(value))
          
          inline def setFileNameGetterUndefined: Self = StObject.set(x, "fileNameGetter", js.undefined)
          
          inline def setHideElements(value: String): Self = StObject.set(x, "hideElements", value.asInstanceOf[js.Any])
          
          inline def setHideElementsUndefined: Self = StObject.set(x, "hideElements", js.undefined)
          
          inline def setLibraryRoot(value: String): Self = StObject.set(x, "libraryRoot", value.asInstanceOf[js.Any])
          
          inline def setLibraryRootUndefined: Self = StObject.set(x, "libraryRoot", js.undefined)
          
          inline def setMismatchTolerance(value: Double): Self = StObject.set(x, "mismatchTolerance", value.asInstanceOf[js.Any])
          
          inline def setMismatchToleranceUndefined: Self = StObject.set(x, "mismatchTolerance", js.undefined)
          
          inline def setOnComplete(
            value: (/* tests */ js.Array[PhantomCSSTest], /* noOfFails */ Double, /* noOfErrors */ Double) => Unit
          ): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
          
          inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
          
          inline def setOnFail(value: /* test */ PhantomCSSTest => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction1(value))
          
          inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
          
          inline def setOnNewImage(value: /* test */ PhantomCSSTest => Unit): Self = StObject.set(x, "onNewImage", js.Any.fromFunction1(value))
          
          inline def setOnNewImageUndefined: Self = StObject.set(x, "onNewImage", js.undefined)
          
          inline def setOnPass(value: /* test */ PhantomCSSTest => Unit): Self = StObject.set(x, "onPass", js.Any.fromFunction1(value))
          
          inline def setOnPassUndefined: Self = StObject.set(x, "onPass", js.undefined)
          
          inline def setOnTimeout(value: /* test */ PhantomCSSTest => Unit): Self = StObject.set(x, "onTimeout", js.Any.fromFunction1(value))
          
          inline def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
          
          inline def setOutputSettings(value: OutputSettings_): Self = StObject.set(x, "outputSettings", value.asInstanceOf[js.Any])
          
          inline def setOutputSettingsUndefined: Self = StObject.set(x, "outputSettings", js.undefined)
          
          inline def setPrefixCount(value: Boolean): Self = StObject.set(x, "prefixCount", value.asInstanceOf[js.Any])
          
          inline def setPrefixCountUndefined: Self = StObject.set(x, "prefixCount", js.undefined)
          
          inline def setRebase(value: Any): Self = StObject.set(x, "rebase", value.asInstanceOf[js.Any])
          
          inline def setRebaseUndefined: Self = StObject.set(x, "rebase", js.undefined)
          
          inline def setScreenshotRoot(value: String): Self = StObject.set(x, "screenshotRoot", value.asInstanceOf[js.Any])
          
          inline def setScreenshotRootUndefined: Self = StObject.set(x, "screenshotRoot", js.undefined)
        }
      }
      
      trait PhantomCSSTest extends StObject {
        
        var error: js.UndefOr[Boolean] = js.undefined
        
        var fail: js.UndefOr[Boolean] = js.undefined
        
        var failFile: js.UndefOr[String] = js.undefined
        
        var filename: js.UndefOr[String] = js.undefined
        
        var mismatch: js.UndefOr[Any] = js.undefined
        
        var success: js.UndefOr[Boolean] = js.undefined
      }
      object PhantomCSSTest {
        
        inline def apply(): PhantomCSSTest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PhantomCSSTest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: PhantomCSSTest] (val x: Self) extends AnyVal {
          
          inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
          
          inline def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
          
          inline def setFailFile(value: String): Self = StObject.set(x, "failFile", value.asInstanceOf[js.Any])
          
          inline def setFailFileUndefined: Self = StObject.set(x, "failFile", js.undefined)
          
          inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
          
          inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
          
          inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
          
          inline def setMismatch(value: Any): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
          
          inline def setMismatchUndefined: Self = StObject.set(x, "mismatch", js.undefined)
          
          inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
          
          inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
        }
      }
    }
  }
}
