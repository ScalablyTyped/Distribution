package typings.passportLocalMongoose

import typings.passportLocal.mod.Strategy
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongoose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def model[T /* <: Document */](name: String): PassportLocalModel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: Unit, collection: String): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: Unit, collection: String, skipInit: Boolean): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: Unit, collection: Unit, skipInit: Boolean): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  @scala.inline
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: Unit, skipInit: Boolean): PassportLocalModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PassportLocalModel[T]]
  
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String): U = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: Unit, collection: String): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: Unit, collection: String, skipInit: Boolean): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: Unit, collection: Unit, skipInit: Boolean): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema, collection: String): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  @scala.inline
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema, collection: Unit, skipInit: Boolean): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  
  @js.native
  trait AuthenticateMethod[T] extends StObject {
    
    def apply(username: String, password: String): js.Promise[AuthenticationResult] = js.native
    def apply(
      username: String,
      password: String,
      cb: js.Function3[/* err */ js.Any, /* user */ T | Boolean, /* error */ js.Any, Unit]
    ): Unit = js.native
  }
  
  trait AuthenticationResult extends StObject {
    
    var error: js.Any
    
    var user: js.Any
  }
  object AuthenticationResult {
    
    @scala.inline
    def apply(error: js.Any, user: js.Any): AuthenticationResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationResult]
    }
    
    @scala.inline
    implicit class AuthenticationResultMutableBuilder[Self <: AuthenticationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PassportLocalDocument
    extends StObject
       with Document {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def authenticate(password: String): js.Promise[AuthenticationResult] = js.native
    def authenticate(password: String, cb: js.Function3[/* err */ js.Any, /* user */ js.Any, /* error */ js.Any, Unit]): Unit = js.native
    
    def changePassword(oldPassword: String, newPassword: String): js.Promise[PassportLocalDocument] = js.native
    def changePassword(
      oldPassword: String,
      newPassword: String,
      cb: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    def resetAttempts(): js.Promise[PassportLocalDocument] = js.native
    def resetAttempts(cb: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
    
    def setPassword(password: String): js.Promise[PassportLocalDocument] = js.native
    def setPassword(password: String, cb: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
  }
  
  trait PassportLocalErrorMessages extends StObject {
    
    var AttemptTooSoonError: js.UndefOr[String] = js.undefined
    
    var IncorrectPasswordError: js.UndefOr[String] = js.undefined
    
    var IncorrectUsernameError: js.UndefOr[String] = js.undefined
    
    var MissingPasswordError: js.UndefOr[String] = js.undefined
    
    var MissingUsernameError: js.UndefOr[String] = js.undefined
    
    var NoSaltValueStoredError: js.UndefOr[String] = js.undefined
    
    var TooManyAttemptsError: js.UndefOr[String] = js.undefined
    
    var UserExistsError: js.UndefOr[String] = js.undefined
  }
  object PassportLocalErrorMessages {
    
    @scala.inline
    def apply(): PassportLocalErrorMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PassportLocalErrorMessages]
    }
    
    @scala.inline
    implicit class PassportLocalErrorMessagesMutableBuilder[Self <: PassportLocalErrorMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttemptTooSoonError(value: String): Self = StObject.set(x, "AttemptTooSoonError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptTooSoonErrorUndefined: Self = StObject.set(x, "AttemptTooSoonError", js.undefined)
      
      @scala.inline
      def setIncorrectPasswordError(value: String): Self = StObject.set(x, "IncorrectPasswordError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncorrectPasswordErrorUndefined: Self = StObject.set(x, "IncorrectPasswordError", js.undefined)
      
      @scala.inline
      def setIncorrectUsernameError(value: String): Self = StObject.set(x, "IncorrectUsernameError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncorrectUsernameErrorUndefined: Self = StObject.set(x, "IncorrectUsernameError", js.undefined)
      
      @scala.inline
      def setMissingPasswordError(value: String): Self = StObject.set(x, "MissingPasswordError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingPasswordErrorUndefined: Self = StObject.set(x, "MissingPasswordError", js.undefined)
      
      @scala.inline
      def setMissingUsernameError(value: String): Self = StObject.set(x, "MissingUsernameError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingUsernameErrorUndefined: Self = StObject.set(x, "MissingUsernameError", js.undefined)
      
      @scala.inline
      def setNoSaltValueStoredError(value: String): Self = StObject.set(x, "NoSaltValueStoredError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSaltValueStoredErrorUndefined: Self = StObject.set(x, "NoSaltValueStoredError", js.undefined)
      
      @scala.inline
      def setTooManyAttemptsError(value: String): Self = StObject.set(x, "TooManyAttemptsError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooManyAttemptsErrorUndefined: Self = StObject.set(x, "TooManyAttemptsError", js.undefined)
      
      @scala.inline
      def setUserExistsError(value: String): Self = StObject.set(x, "UserExistsError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserExistsErrorUndefined: Self = StObject.set(x, "UserExistsError", js.undefined)
    }
  }
  
  // statics
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Model<T> * / any */ @js.native
  trait PassportLocalModel[T /* <: Document */] extends StObject {
    
    def authenticate(): AuthenticateMethod[T] = js.native
    
    def createStrategy(): Strategy = js.native
    
    def deserializeUser(): js.Function2[
        /* username */ String, 
        /* cb */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
        Unit
      ] = js.native
    
    def findByUsername(username: String, selectHashSaltFields: Boolean): js.Any = js.native
    def findByUsername(
      username: String,
      selectHashSaltFields: Boolean,
      cb: js.Function2[/* err */ js.Any, /* account */ js.Any, Unit]
    ): js.Any = js.native
    
    def register(user: T, password: String): js.Promise[T] = js.native
    def register(user: T, password: String, cb: js.Function2[/* err */ js.Any, /* account */ js.Any, Unit]): Unit = js.native
    
    def serializeUser(): js.Function2[
        /* user */ PassportLocalModel[T], 
        /* cb */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[js.Any], Unit], 
        Unit
      ] = js.native
  }
  
  trait PassportLocalOptions extends StObject {
    
    var attemptsField: js.UndefOr[String] = js.undefined
    
    var digestAlgorithm: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var errorMessages: js.UndefOr[PassportLocalErrorMessages] = js.undefined
    
    var hashField: js.UndefOr[String] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var keylen: js.UndefOr[Double] = js.undefined
    
    var lastLoginField: js.UndefOr[String] = js.undefined
    
    var limitAttempts: js.UndefOr[Boolean] = js.undefined
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var maxInterval: js.UndefOr[Double] = js.undefined
    
    var passwordValidator: js.UndefOr[
        js.Function2[/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit], Unit]
      ] = js.undefined
    
    var populateFields: js.UndefOr[String] = js.undefined
    
    var saltField: js.UndefOr[String] = js.undefined
    
    var saltlen: js.UndefOr[Double] = js.undefined
    
    var selectFields: js.UndefOr[String] = js.undefined
    
    var usernameField: js.UndefOr[String] = js.undefined
    
    var usernameLowerCase: js.UndefOr[Boolean] = js.undefined
    
    var usernameQueryFields: js.Array[String]
    
    var usernameUnique: js.UndefOr[Boolean] = js.undefined
  }
  object PassportLocalOptions {
    
    @scala.inline
    def apply(usernameQueryFields: js.Array[String]): PassportLocalOptions = {
      val __obj = js.Dynamic.literal(usernameQueryFields = usernameQueryFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassportLocalOptions]
    }
    
    @scala.inline
    implicit class PassportLocalOptionsMutableBuilder[Self <: PassportLocalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttemptsField(value: String): Self = StObject.set(x, "attemptsField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsFieldUndefined: Self = StObject.set(x, "attemptsField", js.undefined)
      
      @scala.inline
      def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setErrorMessages(value: PassportLocalErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
      
      @scala.inline
      def setHashField(value: String): Self = StObject.set(x, "hashField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashFieldUndefined: Self = StObject.set(x, "hashField", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setKeylen(value: Double): Self = StObject.set(x, "keylen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeylenUndefined: Self = StObject.set(x, "keylen", js.undefined)
      
      @scala.inline
      def setLastLoginField(value: String): Self = StObject.set(x, "lastLoginField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastLoginFieldUndefined: Self = StObject.set(x, "lastLoginField", js.undefined)
      
      @scala.inline
      def setLimitAttempts(value: Boolean): Self = StObject.set(x, "limitAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitAttemptsUndefined: Self = StObject.set(x, "limitAttempts", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setMaxInterval(value: Double): Self = StObject.set(x, "maxInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIntervalUndefined: Self = StObject.set(x, "maxInterval", js.undefined)
      
      @scala.inline
      def setPasswordValidator(value: (/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "passwordValidator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPasswordValidatorUndefined: Self = StObject.set(x, "passwordValidator", js.undefined)
      
      @scala.inline
      def setPopulateFields(value: String): Self = StObject.set(x, "populateFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulateFieldsUndefined: Self = StObject.set(x, "populateFields", js.undefined)
      
      @scala.inline
      def setSaltField(value: String): Self = StObject.set(x, "saltField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltFieldUndefined: Self = StObject.set(x, "saltField", js.undefined)
      
      @scala.inline
      def setSaltlen(value: Double): Self = StObject.set(x, "saltlen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltlenUndefined: Self = StObject.set(x, "saltlen", js.undefined)
      
      @scala.inline
      def setSelectFields(value: String): Self = StObject.set(x, "selectFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectFieldsUndefined: Self = StObject.set(x, "selectFields", js.undefined)
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
      
      @scala.inline
      def setUsernameLowerCase(value: Boolean): Self = StObject.set(x, "usernameLowerCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameLowerCaseUndefined: Self = StObject.set(x, "usernameLowerCase", js.undefined)
      
      @scala.inline
      def setUsernameQueryFields(value: js.Array[String]): Self = StObject.set(x, "usernameQueryFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameQueryFieldsVarargs(value: String*): Self = StObject.set(x, "usernameQueryFields", js.Array(value :_*))
      
      @scala.inline
      def setUsernameUnique(value: Boolean): Self = StObject.set(x, "usernameUnique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUniqueUndefined: Self = StObject.set(x, "usernameUnique", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema * / any */ @js.native
  trait PassportLocalSchema extends StObject {
    
    // overload for the default mongoose plugin function
    def plugin(
      plugin: js.Function2[
          (/* schema */ this.type) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ /* schema */ js.Any), 
          js.UndefOr[js.Object | PassportLocalOptions], 
          Unit
        ]
    ): this.type = js.native
    def plugin(
      plugin: js.Function2[/* schema */ this.type, /* options */ js.UndefOr[PassportLocalOptions], Unit],
      options: PassportLocalOptions
    ): this.type = js.native
    def plugin(
      plugin: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ /* schema */ js.Any, 
          /* options */ js.UndefOr[js.Object], 
          Unit
        ],
      opts: js.Object
    ): this.type = js.native
  }
}
