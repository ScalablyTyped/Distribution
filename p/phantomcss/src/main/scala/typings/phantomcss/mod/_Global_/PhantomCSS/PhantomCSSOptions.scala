package typings.phantomcss.mod._Global_.PhantomCSS

import typings.casperjs.mod.Casper
import typings.resemblejs.mod.OutputSettings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhantomCSSOptions extends js.Object {
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
  var rebase: js.UndefOr[js.Any] = js.undefined
  var screenshotRoot: js.UndefOr[String] = js.undefined
}

object PhantomCSSOptions {
  @scala.inline
  def apply(
    addIteratorToImage: Boolean,
    addLabelToFailedImage: js.UndefOr[Boolean] = js.undefined,
    casper: Casper = null,
    cleanupComparisonImages: js.UndefOr[Boolean] = js.undefined,
    comparisonResultRoot: String = null,
    failedComparisonsRoot: String = null,
    fileNameGetter: (/* rootPath */ String, /* fileName */ js.UndefOr[String]) => String = null,
    hideElements: String = null,
    libraryRoot: String = null,
    mismatchTolerance: Int | Double = null,
    onComplete: (/* tests */ js.Array[PhantomCSSTest], /* noOfFails */ Double, /* noOfErrors */ Double) => Unit = null,
    onFail: /* test */ PhantomCSSTest => Unit = null,
    onNewImage: /* test */ PhantomCSSTest => Unit = null,
    onPass: /* test */ PhantomCSSTest => Unit = null,
    onTimeout: /* test */ PhantomCSSTest => Unit = null,
    outputSettings: OutputSettings_ = null,
    prefixCount: js.UndefOr[Boolean] = js.undefined,
    rebase: js.Any = null,
    screenshotRoot: String = null
  ): PhantomCSSOptions = {
    val __obj = js.Dynamic.literal(addIteratorToImage = addIteratorToImage.asInstanceOf[js.Any])
    if (!js.isUndefined(addLabelToFailedImage)) __obj.updateDynamic("addLabelToFailedImage")(addLabelToFailedImage.asInstanceOf[js.Any])
    if (casper != null) __obj.updateDynamic("casper")(casper.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanupComparisonImages)) __obj.updateDynamic("cleanupComparisonImages")(cleanupComparisonImages.asInstanceOf[js.Any])
    if (comparisonResultRoot != null) __obj.updateDynamic("comparisonResultRoot")(comparisonResultRoot.asInstanceOf[js.Any])
    if (failedComparisonsRoot != null) __obj.updateDynamic("failedComparisonsRoot")(failedComparisonsRoot.asInstanceOf[js.Any])
    if (fileNameGetter != null) __obj.updateDynamic("fileNameGetter")(js.Any.fromFunction2(fileNameGetter))
    if (hideElements != null) __obj.updateDynamic("hideElements")(hideElements.asInstanceOf[js.Any])
    if (libraryRoot != null) __obj.updateDynamic("libraryRoot")(libraryRoot.asInstanceOf[js.Any])
    if (mismatchTolerance != null) __obj.updateDynamic("mismatchTolerance")(mismatchTolerance.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction3(onComplete))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onNewImage != null) __obj.updateDynamic("onNewImage")(js.Any.fromFunction1(onNewImage))
    if (onPass != null) __obj.updateDynamic("onPass")(js.Any.fromFunction1(onPass))
    if (onTimeout != null) __obj.updateDynamic("onTimeout")(js.Any.fromFunction1(onTimeout))
    if (outputSettings != null) __obj.updateDynamic("outputSettings")(outputSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(prefixCount)) __obj.updateDynamic("prefixCount")(prefixCount.asInstanceOf[js.Any])
    if (rebase != null) __obj.updateDynamic("rebase")(rebase.asInstanceOf[js.Any])
    if (screenshotRoot != null) __obj.updateDynamic("screenshotRoot")(screenshotRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhantomCSSOptions]
  }
}

