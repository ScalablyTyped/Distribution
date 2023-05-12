package typings.nginstackJsunit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestSuiteMod {
  
  inline def apply(fileId: String): Unit = ^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileId: String, opt_sourceEncoding: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any], opt_sourceEncoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fileId: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileId: Double, opt_sourceEncoding: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any], opt_sourceEncoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/jsunit/lib/TestSuite", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TestSuite {
    def this(fileId: String) = this()
    def this(fileId: Double) = this()
    def this(fileId: String, opt_sourceEncoding: String) = this()
    def this(fileId: Double, opt_sourceEncoding: String) = this()
    
    /* private */ /* CompleteClass */
    var _tests: Any = js.native
    
    /* private */ /* CompleteClass */
    var _testsByName: Any = js.native
    
    /* private */ /* CompleteClass */
    var argumentsIncludeComments_ : Any = js.native
    
    /* CompleteClass */
    override def assert(message: Any, condition: Any, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertEquals(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertFalse(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNan(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotEquals(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotNan(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotNull(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotUndefined(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNull(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertTrue(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertUndefined(args: Any*): Unit = js.native
    
    /* private */ /* CompleteClass */
    var assert_ : Any = js.native
    
    /* CompleteClass */
    override def check(condition: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualArrays(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualDates(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualArrays(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualDates(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var commentArg_ : Any = js.native
    
    /* CompleteClass */
    override def declareTestMethods(): Unit = js.native
    
    /* CompleteClass */
    override def deleteTestMethods(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var displayStringForValue_ : Any = js.native
    
    /* CompleteClass */
    override def fail(msg: String): scala.Nothing = js.native
    
    /* CompleteClass */
    override def failEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def failNotEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var fail_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fileId_ : Any = js.native
    
    /* CompleteClass */
    var filePath: String = js.native
    
    /* CompleteClass */
    override def getFileId(): String | Double = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    /* CompleteClass */
    override def getSourceEncoding(): String = js.native
    
    /* CompleteClass */
    override def getTestByName(name: Any): Any = js.native
    
    /* CompleteClass */
    override def getTests(): js.Array[Any] = js.native
    
    /* private */ /* CompleteClass */
    var getUfsTestType_ : Any = js.native
    
    /* CompleteClass */
    override def isEqualArrays(ar1: Any, ar2: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isTestCase(methodName: Any): Boolean = js.native
    
    /* CompleteClass */
    var key: Double | Null = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var nonCommentArg_ : Any = js.native
    
    /* CompleteClass */
    override def removeTime(dt: js.Date): js.Date = js.native
    
    /* CompleteClass */
    override def setUp(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var sourceEncoding_ : Any = js.native
    
    /* CompleteClass */
    override def tearDown(): Unit = js.native
    
    /* CompleteClass */
    var `type`: Double = js.native
    
    /* private */ /* CompleteClass */
    var type_ : Any = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var validateArguments_ : Any = js.native
    
    /* CompleteClass */
    var version: Double | Null = js.native
  }
  @JSImport("@nginstack/jsunit/lib/TestSuite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TestSuite extends StObject {
    
    /* private */ var _tests: Any
    
    /* private */ var _testsByName: Any
    
    /* private */ var argumentsIncludeComments_ : Any
    
    def assert(message: Any, condition: Any, args: Any*): Unit
    
    def assertEquals(args: Any*): Unit
    
    def assertFalse(args: Any*): Unit
    
    def assertNan(args: Any*): Unit
    
    def assertNotEquals(args: Any*): Unit
    
    def assertNotNan(args: Any*): Unit
    
    def assertNotNull(args: Any*): Unit
    
    def assertNotUndefined(args: Any*): Unit
    
    def assertNull(args: Any*): Unit
    
    def assertTrue(args: Any*): Unit
    
    def assertUndefined(args: Any*): Unit
    
    /* private */ var assert_ : Any
    
    def check(condition: Any, msg: Any): Unit
    
    def checkEqualArrays(expected: Any, actual: Any, msg: Any): Unit
    
    def checkEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit
    
    def checkEqualDates(expected: Any, actual: Any, msg: Any): Unit
    
    def checkEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit
    
    def checkEquals(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualArrays(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualDates(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit
    
    def checkNotEquals(expected: Any, actual: Any, msg: Any): Unit
    
    /* private */ var commentArg_ : Any
    
    def declareTestMethods(): Unit
    
    def deleteTestMethods(): Unit
    
    /* private */ var displayStringForValue_ : Any
    
    def fail(msg: String): scala.Nothing
    
    def failEquals(expected: Any, actual: Any, msg: Any): Unit
    
    def failNotEquals(expected: Any, actual: Any, msg: Any): Unit
    
    /* private */ var fail_ : Any
    
    /* private */ var fileId_ : Any
    
    var filePath: String
    
    def getFileId(): String | Double
    
    def getId(): String
    
    def getSourceEncoding(): String
    
    def getTestByName(name: Any): Any
    
    def getTests(): js.Array[Any]
    
    /* private */ var getUfsTestType_ : Any
    
    def isEqualArrays(ar1: Any, ar2: Any): Boolean
    
    def isTestCase(methodName: Any): Boolean
    
    var key: Double | Null
    
    var name: String
    
    /* private */ var nonCommentArg_ : Any
    
    def removeTime(dt: js.Date): js.Date
    
    def setUp(): Unit
    
    /* private */ var sourceEncoding_ : Any
    
    def tearDown(): Unit
    
    var `type`: Double
    
    /* private */ var type_ : Any
    
    def update(): Unit
    
    /* private */ var validateArguments_ : Any
    
    var version: Double | Null
  }
  object TestSuite {
    
    inline def apply(
      _tests: Any,
      _testsByName: Any,
      argumentsIncludeComments_ : Any,
      assert: (Any, Any, /* repeated */ Any) => Unit,
      assertEquals: /* repeated */ Any => Unit,
      assertFalse: /* repeated */ Any => Unit,
      assertNan: /* repeated */ Any => Unit,
      assertNotEquals: /* repeated */ Any => Unit,
      assertNotNan: /* repeated */ Any => Unit,
      assertNotNull: /* repeated */ Any => Unit,
      assertNotUndefined: /* repeated */ Any => Unit,
      assertNull: /* repeated */ Any => Unit,
      assertTrue: /* repeated */ Any => Unit,
      assertUndefined: /* repeated */ Any => Unit,
      assert_ : Any,
      check: (Any, Any) => Unit,
      checkEqualArrays: (Any, Any, Any) => Unit,
      checkEqualDateTimes: (Any, Any, Any) => Unit,
      checkEqualDates: (Any, Any, Any) => Unit,
      checkEqualNumbers: (Any, Any, Any, Any) => Unit,
      checkEquals: (Any, Any, Any) => Unit,
      checkNotEqualArrays: (Any, Any, Any) => Unit,
      checkNotEqualDateTimes: (Any, Any, Any) => Unit,
      checkNotEqualDates: (Any, Any, Any) => Unit,
      checkNotEqualNumbers: (Any, Any, Any, Any) => Unit,
      checkNotEquals: (Any, Any, Any) => Unit,
      commentArg_ : Any,
      declareTestMethods: () => Unit,
      deleteTestMethods: () => Unit,
      displayStringForValue_ : Any,
      fail: String => scala.Nothing,
      failEquals: (Any, Any, Any) => Unit,
      failNotEquals: (Any, Any, Any) => Unit,
      fail_ : Any,
      fileId_ : Any,
      filePath: String,
      getFileId: () => String | Double,
      getId: () => String,
      getSourceEncoding: () => String,
      getTestByName: Any => Any,
      getTests: () => js.Array[Any],
      getUfsTestType_ : Any,
      isEqualArrays: (Any, Any) => Boolean,
      isTestCase: Any => Boolean,
      name: String,
      nonCommentArg_ : Any,
      removeTime: js.Date => js.Date,
      setUp: () => Unit,
      sourceEncoding_ : Any,
      tearDown: () => Unit,
      `type`: Double,
      type_ : Any,
      update: () => Unit,
      validateArguments_ : Any
    ): TestSuite = {
      val __obj = js.Dynamic.literal(_tests = _tests.asInstanceOf[js.Any], _testsByName = _testsByName.asInstanceOf[js.Any], argumentsIncludeComments_ = argumentsIncludeComments_.asInstanceOf[js.Any], assert = js.Any.fromFunction3(assert), assertEquals = js.Any.fromFunction1(assertEquals), assertFalse = js.Any.fromFunction1(assertFalse), assertNan = js.Any.fromFunction1(assertNan), assertNotEquals = js.Any.fromFunction1(assertNotEquals), assertNotNan = js.Any.fromFunction1(assertNotNan), assertNotNull = js.Any.fromFunction1(assertNotNull), assertNotUndefined = js.Any.fromFunction1(assertNotUndefined), assertNull = js.Any.fromFunction1(assertNull), assertTrue = js.Any.fromFunction1(assertTrue), assertUndefined = js.Any.fromFunction1(assertUndefined), assert_ = assert_.asInstanceOf[js.Any], check = js.Any.fromFunction2(check), checkEqualArrays = js.Any.fromFunction3(checkEqualArrays), checkEqualDateTimes = js.Any.fromFunction3(checkEqualDateTimes), checkEqualDates = js.Any.fromFunction3(checkEqualDates), checkEqualNumbers = js.Any.fromFunction4(checkEqualNumbers), checkEquals = js.Any.fromFunction3(checkEquals), checkNotEqualArrays = js.Any.fromFunction3(checkNotEqualArrays), checkNotEqualDateTimes = js.Any.fromFunction3(checkNotEqualDateTimes), checkNotEqualDates = js.Any.fromFunction3(checkNotEqualDates), checkNotEqualNumbers = js.Any.fromFunction4(checkNotEqualNumbers), checkNotEquals = js.Any.fromFunction3(checkNotEquals), commentArg_ = commentArg_.asInstanceOf[js.Any], declareTestMethods = js.Any.fromFunction0(declareTestMethods), deleteTestMethods = js.Any.fromFunction0(deleteTestMethods), displayStringForValue_ = displayStringForValue_.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), failEquals = js.Any.fromFunction3(failEquals), failNotEquals = js.Any.fromFunction3(failNotEquals), fail_ = fail_.asInstanceOf[js.Any], fileId_ = fileId_.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], getFileId = js.Any.fromFunction0(getFileId), getId = js.Any.fromFunction0(getId), getSourceEncoding = js.Any.fromFunction0(getSourceEncoding), getTestByName = js.Any.fromFunction1(getTestByName), getTests = js.Any.fromFunction0(getTests), getUfsTestType_ = getUfsTestType_.asInstanceOf[js.Any], isEqualArrays = js.Any.fromFunction2(isEqualArrays), isTestCase = js.Any.fromFunction1(isTestCase), name = name.asInstanceOf[js.Any], nonCommentArg_ = nonCommentArg_.asInstanceOf[js.Any], removeTime = js.Any.fromFunction1(removeTime), setUp = js.Any.fromFunction0(setUp), sourceEncoding_ = sourceEncoding_.asInstanceOf[js.Any], tearDown = js.Any.fromFunction0(tearDown), type_ = type_.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), validateArguments_ = validateArguments_.asInstanceOf[js.Any], key = null, version = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestSuite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestSuite] (val x: Self) extends AnyVal {
      
      inline def setArgumentsIncludeComments_(value: Any): Self = StObject.set(x, "argumentsIncludeComments_", value.asInstanceOf[js.Any])
      
      inline def setAssert(value: (Any, Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction3(value))
      
      inline def setAssertEquals(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertEquals", js.Any.fromFunction1(value))
      
      inline def setAssertFalse(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertFalse", js.Any.fromFunction1(value))
      
      inline def setAssertNan(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertNan", js.Any.fromFunction1(value))
      
      inline def setAssertNotEquals(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertNotEquals", js.Any.fromFunction1(value))
      
      inline def setAssertNotNan(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertNotNan", js.Any.fromFunction1(value))
      
      inline def setAssertNotNull(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertNotNull", js.Any.fromFunction1(value))
      
      inline def setAssertNotUndefined(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertNotUndefined", js.Any.fromFunction1(value))
      
      inline def setAssertNull(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertNull", js.Any.fromFunction1(value))
      
      inline def setAssertTrue(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertTrue", js.Any.fromFunction1(value))
      
      inline def setAssertUndefined(value: /* repeated */ Any => Unit): Self = StObject.set(x, "assertUndefined", js.Any.fromFunction1(value))
      
      inline def setAssert_(value: Any): Self = StObject.set(x, "assert_", value.asInstanceOf[js.Any])
      
      inline def setCheck(value: (Any, Any) => Unit): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
      
      inline def setCheckEqualArrays(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkEqualArrays", js.Any.fromFunction3(value))
      
      inline def setCheckEqualDateTimes(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkEqualDateTimes", js.Any.fromFunction3(value))
      
      inline def setCheckEqualDates(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkEqualDates", js.Any.fromFunction3(value))
      
      inline def setCheckEqualNumbers(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "checkEqualNumbers", js.Any.fromFunction4(value))
      
      inline def setCheckEquals(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkEquals", js.Any.fromFunction3(value))
      
      inline def setCheckNotEqualArrays(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkNotEqualArrays", js.Any.fromFunction3(value))
      
      inline def setCheckNotEqualDateTimes(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkNotEqualDateTimes", js.Any.fromFunction3(value))
      
      inline def setCheckNotEqualDates(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkNotEqualDates", js.Any.fromFunction3(value))
      
      inline def setCheckNotEqualNumbers(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "checkNotEqualNumbers", js.Any.fromFunction4(value))
      
      inline def setCheckNotEquals(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "checkNotEquals", js.Any.fromFunction3(value))
      
      inline def setCommentArg_(value: Any): Self = StObject.set(x, "commentArg_", value.asInstanceOf[js.Any])
      
      inline def setDeclareTestMethods(value: () => Unit): Self = StObject.set(x, "declareTestMethods", js.Any.fromFunction0(value))
      
      inline def setDeleteTestMethods(value: () => Unit): Self = StObject.set(x, "deleteTestMethods", js.Any.fromFunction0(value))
      
      inline def setDisplayStringForValue_(value: Any): Self = StObject.set(x, "displayStringForValue_", value.asInstanceOf[js.Any])
      
      inline def setFail(value: String => scala.Nothing): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setFailEquals(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "failEquals", js.Any.fromFunction3(value))
      
      inline def setFailNotEquals(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "failNotEquals", js.Any.fromFunction3(value))
      
      inline def setFail_(value: Any): Self = StObject.set(x, "fail_", value.asInstanceOf[js.Any])
      
      inline def setFileId_(value: Any): Self = StObject.set(x, "fileId_", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setGetFileId(value: () => String | Double): Self = StObject.set(x, "getFileId", js.Any.fromFunction0(value))
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetSourceEncoding(value: () => String): Self = StObject.set(x, "getSourceEncoding", js.Any.fromFunction0(value))
      
      inline def setGetTestByName(value: Any => Any): Self = StObject.set(x, "getTestByName", js.Any.fromFunction1(value))
      
      inline def setGetTests(value: () => js.Array[Any]): Self = StObject.set(x, "getTests", js.Any.fromFunction0(value))
      
      inline def setGetUfsTestType_(value: Any): Self = StObject.set(x, "getUfsTestType_", value.asInstanceOf[js.Any])
      
      inline def setIsEqualArrays(value: (Any, Any) => Boolean): Self = StObject.set(x, "isEqualArrays", js.Any.fromFunction2(value))
      
      inline def setIsTestCase(value: Any => Boolean): Self = StObject.set(x, "isTestCase", js.Any.fromFunction1(value))
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNonCommentArg_(value: Any): Self = StObject.set(x, "nonCommentArg_", value.asInstanceOf[js.Any])
      
      inline def setRemoveTime(value: js.Date => js.Date): Self = StObject.set(x, "removeTime", js.Any.fromFunction1(value))
      
      inline def setSetUp(value: () => Unit): Self = StObject.set(x, "setUp", js.Any.fromFunction0(value))
      
      inline def setSourceEncoding_(value: Any): Self = StObject.set(x, "sourceEncoding_", value.asInstanceOf[js.Any])
      
      inline def setTearDown(value: () => Unit): Self = StObject.set(x, "tearDown", js.Any.fromFunction0(value))
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setType_(value: Any): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setValidateArguments_(value: Any): Self = StObject.set(x, "validateArguments_", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def set_tests(value: Any): Self = StObject.set(x, "_tests", value.asInstanceOf[js.Any])
      
      inline def set_testsByName(value: Any): Self = StObject.set(x, "_testsByName", value.asInstanceOf[js.Any])
    }
  }
}
