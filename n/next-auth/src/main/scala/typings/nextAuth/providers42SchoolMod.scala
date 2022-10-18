package typings.nextAuth

import typings.nextAuth.anon.Createdat
import typings.nextAuth.anon.Id
import typings.nextAuth.anon.IdName
import typings.nextAuth.anon.Name
import typings.nextAuth.anon.Parentid
import typings.nextAuth.nextAuthStrings.challenge
import typings.nextAuth.nextAuthStrings.easy
import typings.nextAuth.nextAuthStrings.finished
import typings.nextAuth.nextAuthStrings.hard
import typings.nextAuth.nextAuthStrings.hidden
import typings.nextAuth.nextAuthStrings.in_progress
import typings.nextAuth.nextAuthStrings.medium
import typings.nextAuth.nextAuthStrings.none
import typings.nextAuth.nextAuthStrings.pedagogy
import typings.nextAuth.nextAuthStrings.project
import typings.nextAuth.nextAuthStrings.scolarity
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providers42SchoolMod {
  
  @JSImport("next-auth/providers/42-school", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: FortyTwoProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  trait Achievement extends StObject {
    
    var description: String
    
    var id: Double
    
    var image: String | Null
    
    var kind: scolarity | project | pedagogy
    
    var name: String
    
    var nbr_of_success: Double | Null
    
    var tier: none | easy | medium | hard | challenge
    
    var users_url: String
    
    var visible: Boolean
  }
  object Achievement {
    
    inline def apply(
      description: String,
      id: Double,
      kind: scolarity | project | pedagogy,
      name: String,
      tier: none | easy | medium | hard | challenge,
      users_url: String,
      visible: Boolean
    ): Achievement = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], image = null, nbr_of_success = null)
      __obj.asInstanceOf[Achievement]
    }
    
    extension [Self <: Achievement](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setKind(value: scolarity | project | pedagogy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNbr_of_success(value: Double): Self = StObject.set(x, "nbr_of_success", value.asInstanceOf[js.Any])
      
      inline def setNbr_of_successNull: Self = StObject.set(x, "nbr_of_success", null)
      
      inline def setTier(value: none | easy | medium | hard | challenge): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      inline def setUsers_url(value: String): Self = StObject.set(x, "users_url", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait Campus extends StObject {
    
    var active: Boolean
    
    var address: String
    
    var city: String
    
    var country: String
    
    var default_hidden_phone: Boolean
    
    var email_extension: String
    
    var facebook: String
    
    var id: Double
    
    var language: Createdat
    
    var name: String
    
    var time_zone: String
    
    var twitter: String
    
    var users_count: Double
    
    var vogsphere_id: Double
    
    var website: String
    
    var zip: String
  }
  object Campus {
    
    inline def apply(
      active: Boolean,
      address: String,
      city: String,
      country: String,
      default_hidden_phone: Boolean,
      email_extension: String,
      facebook: String,
      id: Double,
      language: Createdat,
      name: String,
      time_zone: String,
      twitter: String,
      users_count: Double,
      vogsphere_id: Double,
      website: String,
      zip: String
    ): Campus = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], default_hidden_phone = default_hidden_phone.asInstanceOf[js.Any], email_extension = email_extension.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], users_count = users_count.asInstanceOf[js.Any], vogsphere_id = vogsphere_id.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Campus]
    }
    
    extension [Self <: Campus](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDefault_hidden_phone(value: Boolean): Self = StObject.set(x, "default_hidden_phone", value.asInstanceOf[js.Any])
      
      inline def setEmail_extension(value: String): Self = StObject.set(x, "email_extension", value.asInstanceOf[js.Any])
      
      inline def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: Createdat): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setUsers_count(value: Double): Self = StObject.set(x, "users_count", value.asInstanceOf[js.Any])
      
      inline def setVogsphere_id(value: Double): Self = StObject.set(x, "vogsphere_id", value.asInstanceOf[js.Any])
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait CampusUser extends StObject {
    
    var campus_id: Double
    
    var created_at: String
    
    var id: Double
    
    var is_primary: Boolean
    
    var updated_at: String | Null
    
    var user_id: Double
  }
  object CampusUser {
    
    inline def apply(campus_id: Double, created_at: String, id: Double, is_primary: Boolean, user_id: Double): CampusUser = {
      val __obj = js.Dynamic.literal(campus_id = campus_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_primary = is_primary.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], updated_at = null)
      __obj.asInstanceOf[CampusUser]
    }
    
    extension [Self <: CampusUser](x: Self) {
      
      inline def setCampus_id(value: Double): Self = StObject.set(x, "campus_id", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs_primary(value: Boolean): Self = StObject.set(x, "is_primary", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait CursusUser extends StObject {
    
    var begin_at: String | Null
    
    var blackholed_at: String | Null
    
    var created_at: String
    
    var cursus: Name
    
    var cursus_id: Double
    
    var end_at: String | Null
    
    var grade: String | Null
    
    var has_coalition: Boolean
    
    var id: Double
    
    var level: Double
    
    var skills: js.Array[Id]
    
    var updated_at: String | Null
    
    var user: UserData
  }
  object CursusUser {
    
    inline def apply(
      created_at: String,
      cursus: Name,
      cursus_id: Double,
      has_coalition: Boolean,
      id: Double,
      level: Double,
      skills: js.Array[Id],
      user: UserData
    ): CursusUser = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], cursus = cursus.asInstanceOf[js.Any], cursus_id = cursus_id.asInstanceOf[js.Any], has_coalition = has_coalition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], begin_at = null, blackholed_at = null, end_at = null, grade = null, updated_at = null)
      __obj.asInstanceOf[CursusUser]
    }
    
    extension [Self <: CursusUser](x: Self) {
      
      inline def setBegin_at(value: String): Self = StObject.set(x, "begin_at", value.asInstanceOf[js.Any])
      
      inline def setBegin_atNull: Self = StObject.set(x, "begin_at", null)
      
      inline def setBlackholed_at(value: String): Self = StObject.set(x, "blackholed_at", value.asInstanceOf[js.Any])
      
      inline def setBlackholed_atNull: Self = StObject.set(x, "blackholed_at", null)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCursus(value: Name): Self = StObject.set(x, "cursus", value.asInstanceOf[js.Any])
      
      inline def setCursus_id(value: Double): Self = StObject.set(x, "cursus_id", value.asInstanceOf[js.Any])
      
      inline def setEnd_at(value: String): Self = StObject.set(x, "end_at", value.asInstanceOf[js.Any])
      
      inline def setEnd_atNull: Self = StObject.set(x, "end_at", null)
      
      inline def setGrade(value: String): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
      
      inline def setGradeNull: Self = StObject.set(x, "grade", null)
      
      inline def setHas_coalition(value: Boolean): Self = StObject.set(x, "has_coalition", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setSkills(value: js.Array[Id]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
      
      inline def setSkillsVarargs(value: Id*): Self = StObject.set(x, "skills", js.Array(value*))
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
      
      inline def setUser(value: UserData): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpertisesUser extends StObject {
    
    var contact_me: Boolean
    
    var created_at: String
    
    var expertise_id: Double
    
    var id: Double
    
    var interested: Boolean
    
    var user_id: Double
    
    var value: Double
  }
  object ExpertisesUser {
    
    inline def apply(
      contact_me: Boolean,
      created_at: String,
      expertise_id: Double,
      id: Double,
      interested: Boolean,
      user_id: Double,
      value: Double
    ): ExpertisesUser = {
      val __obj = js.Dynamic.literal(contact_me = contact_me.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expertise_id = expertise_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interested = interested.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpertisesUser]
    }
    
    extension [Self <: ExpertisesUser](x: Self) {
      
      inline def setContact_me(value: Boolean): Self = StObject.set(x, "contact_me", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setExpertise_id(value: Double): Self = StObject.set(x, "expertise_id", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInterested(value: Boolean): Self = StObject.set(x, "interested", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait FortyTwoProfile
    extends StObject
       with UserData {
    
    var achievements: js.Array[Achievement]
    
    var campus: js.Array[Campus]
    
    var campus_users: js.Array[CampusUser]
    
    var cursus_users: js.Array[CursusUser]
    
    var expertises_users: js.Array[ExpertisesUser]
    
    var groups: js.Array[IdName]
    
    var languages_users: js.Array[LanguagesUser]
    
    var partnerships: js.Array[Any]
    
    var patroned: js.Array[Any]
    
    var patroning: js.Array[Any]
    
    var projects_users: js.Array[ProjectUser]
    
    var roles: js.Array[IdName]
    
    var titles: js.Array[IdName]
    
    var titles_users: js.Array[TitlesUser]
    
    var user: Any | Null
  }
  object FortyTwoProfile {
    
    inline def apply(
      achievements: js.Array[Achievement],
      alumni: Boolean,
      anonymize_date: String,
      campus: js.Array[Campus],
      campus_users: js.Array[CampusUser],
      correction_point: Double,
      created_at: String,
      cursus_users: js.Array[CursusUser],
      displayname: String,
      email: String,
      expertises_users: js.Array[ExpertisesUser],
      first_name: String,
      groups: js.Array[IdName],
      id: Double,
      is_launchedQuestionmark: Boolean,
      languages_users: js.Array[LanguagesUser],
      last_name: String,
      login: String,
      partnerships: js.Array[Any],
      patroned: js.Array[Any],
      patroning: js.Array[Any],
      projects_users: js.Array[ProjectUser],
      roles: js.Array[IdName],
      staffQuestionmark: Boolean,
      titles: js.Array[IdName],
      titles_users: js.Array[TitlesUser],
      url: String,
      wallet: Double
    ): FortyTwoProfile = {
      val __obj = js.Dynamic.literal(achievements = achievements.asInstanceOf[js.Any], alumni = alumni.asInstanceOf[js.Any], anonymize_date = anonymize_date.asInstanceOf[js.Any], campus = campus.asInstanceOf[js.Any], campus_users = campus_users.asInstanceOf[js.Any], correction_point = correction_point.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], cursus_users = cursus_users.asInstanceOf[js.Any], displayname = displayname.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], expertises_users = expertises_users.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], languages_users = languages_users.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], partnerships = partnerships.asInstanceOf[js.Any], patroned = patroned.asInstanceOf[js.Any], patroning = patroning.asInstanceOf[js.Any], projects_users = projects_users.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], titles_users = titles_users.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wallet = wallet.asInstanceOf[js.Any], image_url = null, location = null, phone = null, pool_month = null, pool_year = null, updated_at = null, user = null, usual_first_name = null, usual_full_name = null)
      __obj.updateDynamic("is_launched?")(is_launchedQuestionmark.asInstanceOf[js.Any])
      __obj.updateDynamic("staff?")(staffQuestionmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[FortyTwoProfile]
    }
    
    extension [Self <: FortyTwoProfile](x: Self) {
      
      inline def setAchievements(value: js.Array[Achievement]): Self = StObject.set(x, "achievements", value.asInstanceOf[js.Any])
      
      inline def setAchievementsVarargs(value: Achievement*): Self = StObject.set(x, "achievements", js.Array(value*))
      
      inline def setCampus(value: js.Array[Campus]): Self = StObject.set(x, "campus", value.asInstanceOf[js.Any])
      
      inline def setCampusVarargs(value: Campus*): Self = StObject.set(x, "campus", js.Array(value*))
      
      inline def setCampus_users(value: js.Array[CampusUser]): Self = StObject.set(x, "campus_users", value.asInstanceOf[js.Any])
      
      inline def setCampus_usersVarargs(value: CampusUser*): Self = StObject.set(x, "campus_users", js.Array(value*))
      
      inline def setCursus_users(value: js.Array[CursusUser]): Self = StObject.set(x, "cursus_users", value.asInstanceOf[js.Any])
      
      inline def setCursus_usersVarargs(value: CursusUser*): Self = StObject.set(x, "cursus_users", js.Array(value*))
      
      inline def setExpertises_users(value: js.Array[ExpertisesUser]): Self = StObject.set(x, "expertises_users", value.asInstanceOf[js.Any])
      
      inline def setExpertises_usersVarargs(value: ExpertisesUser*): Self = StObject.set(x, "expertises_users", js.Array(value*))
      
      inline def setGroups(value: js.Array[IdName]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: IdName*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setLanguages_users(value: js.Array[LanguagesUser]): Self = StObject.set(x, "languages_users", value.asInstanceOf[js.Any])
      
      inline def setLanguages_usersVarargs(value: LanguagesUser*): Self = StObject.set(x, "languages_users", js.Array(value*))
      
      inline def setPartnerships(value: js.Array[Any]): Self = StObject.set(x, "partnerships", value.asInstanceOf[js.Any])
      
      inline def setPartnershipsVarargs(value: Any*): Self = StObject.set(x, "partnerships", js.Array(value*))
      
      inline def setPatroned(value: js.Array[Any]): Self = StObject.set(x, "patroned", value.asInstanceOf[js.Any])
      
      inline def setPatronedVarargs(value: Any*): Self = StObject.set(x, "patroned", js.Array(value*))
      
      inline def setPatroning(value: js.Array[Any]): Self = StObject.set(x, "patroning", value.asInstanceOf[js.Any])
      
      inline def setPatroningVarargs(value: Any*): Self = StObject.set(x, "patroning", js.Array(value*))
      
      inline def setProjects_users(value: js.Array[ProjectUser]): Self = StObject.set(x, "projects_users", value.asInstanceOf[js.Any])
      
      inline def setProjects_usersVarargs(value: ProjectUser*): Self = StObject.set(x, "projects_users", js.Array(value*))
      
      inline def setRoles(value: js.Array[IdName]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: IdName*): Self = StObject.set(x, "roles", js.Array(value*))
      
      inline def setTitles(value: js.Array[IdName]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      inline def setTitlesVarargs(value: IdName*): Self = StObject.set(x, "titles", js.Array(value*))
      
      inline def setTitles_users(value: js.Array[TitlesUser]): Self = StObject.set(x, "titles_users", value.asInstanceOf[js.Any])
      
      inline def setTitles_usersVarargs(value: TitlesUser*): Self = StObject.set(x, "titles_users", js.Array(value*))
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  trait LanguagesUser extends StObject {
    
    var created_at: String
    
    var id: Double
    
    var language_id: Double
    
    var position: Double
    
    var user_id: Double
  }
  object LanguagesUser {
    
    inline def apply(created_at: String, id: Double, language_id: Double, position: Double, user_id: Double): LanguagesUser = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language_id = language_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguagesUser]
    }
    
    extension [Self <: LanguagesUser](x: Self) {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage_id(value: Double): Self = StObject.set(x, "language_id", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectUser extends StObject {
    
    var created_at: String
    
    var current_team_id: Double
    
    var cursus_ids: js.Array[Double]
    
    var final_mark: Double | Null
    
    var id: Double
    
    var marked: Boolean
    
    var marked_at: String | Null
    
    var occurrence: Double
    
    var project: Parentid
    
    var retriable_at: String | Null
    
    var status: in_progress | finished
    
    var updated_at: String | Null
    
    @JSName("validated?")
    var validatedQuestionmark: Boolean | Null
  }
  object ProjectUser {
    
    inline def apply(
      created_at: String,
      current_team_id: Double,
      cursus_ids: js.Array[Double],
      id: Double,
      marked: Boolean,
      occurrence: Double,
      project: Parentid,
      status: in_progress | finished
    ): ProjectUser = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], current_team_id = current_team_id.asInstanceOf[js.Any], cursus_ids = cursus_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], occurrence = occurrence.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], final_mark = null, marked_at = null, retriable_at = null, updated_at = null)
      __obj.updateDynamic("validated?")(null)
      __obj.asInstanceOf[ProjectUser]
    }
    
    extension [Self <: ProjectUser](x: Self) {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCurrent_team_id(value: Double): Self = StObject.set(x, "current_team_id", value.asInstanceOf[js.Any])
      
      inline def setCursus_ids(value: js.Array[Double]): Self = StObject.set(x, "cursus_ids", value.asInstanceOf[js.Any])
      
      inline def setCursus_idsVarargs(value: Double*): Self = StObject.set(x, "cursus_ids", js.Array(value*))
      
      inline def setFinal_mark(value: Double): Self = StObject.set(x, "final_mark", value.asInstanceOf[js.Any])
      
      inline def setFinal_markNull: Self = StObject.set(x, "final_mark", null)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMarked(value: Boolean): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
      
      inline def setMarked_at(value: String): Self = StObject.set(x, "marked_at", value.asInstanceOf[js.Any])
      
      inline def setMarked_atNull: Self = StObject.set(x, "marked_at", null)
      
      inline def setOccurrence(value: Double): Self = StObject.set(x, "occurrence", value.asInstanceOf[js.Any])
      
      inline def setProject(value: Parentid): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setRetriable_at(value: String): Self = StObject.set(x, "retriable_at", value.asInstanceOf[js.Any])
      
      inline def setRetriable_atNull: Self = StObject.set(x, "retriable_at", null)
      
      inline def setStatus(value: in_progress | finished): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
      
      inline def setValidatedQuestionmark(value: Boolean): Self = StObject.set(x, "validated?", value.asInstanceOf[js.Any])
      
      inline def setValidatedQuestionmarkNull: Self = StObject.set(x, "validated?", null)
    }
  }
  
  trait TitlesUser extends StObject {
    
    var created_at: String
    
    var id: Double
    
    var selected: Boolean
    
    var title_id: Double
    
    var updated_at: String | Null
    
    var user_id: Double
  }
  object TitlesUser {
    
    inline def apply(created_at: String, id: Double, selected: Boolean, title_id: Double, user_id: Double): TitlesUser = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title_id = title_id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], updated_at = null)
      __obj.asInstanceOf[TitlesUser]
    }
    
    extension [Self <: TitlesUser](x: Self) {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTitle_id(value: Double): Self = StObject.set(x, "title_id", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserData extends StObject {
    
    var alumni: Boolean
    
    var anonymize_date: String
    
    var correction_point: Double
    
    var created_at: String
    
    var displayname: String
    
    var email: String
    
    var first_name: String
    
    var id: Double
    
    var image_url: String | Null
    
    @JSName("is_launched?")
    var is_launchedQuestionmark: Boolean
    
    var last_name: String
    
    var location: String | Null
    
    var login: String
    
    var phone: hidden | String | Null
    
    var pool_month: String | Null
    
    var pool_year: String | Null
    
    @JSName("staff?")
    var staffQuestionmark: Boolean
    
    var updated_at: String | Null
    
    var url: String
    
    var usual_first_name: Null | String
    
    var usual_full_name: Null | String
    
    var wallet: Double
  }
  object UserData {
    
    inline def apply(
      alumni: Boolean,
      anonymize_date: String,
      correction_point: Double,
      created_at: String,
      displayname: String,
      email: String,
      first_name: String,
      id: Double,
      is_launchedQuestionmark: Boolean,
      last_name: String,
      login: String,
      staffQuestionmark: Boolean,
      url: String,
      wallet: Double
    ): UserData = {
      val __obj = js.Dynamic.literal(alumni = alumni.asInstanceOf[js.Any], anonymize_date = anonymize_date.asInstanceOf[js.Any], correction_point = correction_point.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], displayname = displayname.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wallet = wallet.asInstanceOf[js.Any], image_url = null, location = null, phone = null, pool_month = null, pool_year = null, updated_at = null, usual_first_name = null, usual_full_name = null)
      __obj.updateDynamic("is_launched?")(is_launchedQuestionmark.asInstanceOf[js.Any])
      __obj.updateDynamic("staff?")(staffQuestionmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserData]
    }
    
    extension [Self <: UserData](x: Self) {
      
      inline def setAlumni(value: Boolean): Self = StObject.set(x, "alumni", value.asInstanceOf[js.Any])
      
      inline def setAnonymize_date(value: String): Self = StObject.set(x, "anonymize_date", value.asInstanceOf[js.Any])
      
      inline def setCorrection_point(value: Double): Self = StObject.set(x, "correction_point", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setImage_urlNull: Self = StObject.set(x, "image_url", null)
      
      inline def setIs_launchedQuestionmark(value: Boolean): Self = StObject.set(x, "is_launched?", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: hidden | String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneNull: Self = StObject.set(x, "phone", null)
      
      inline def setPool_month(value: String): Self = StObject.set(x, "pool_month", value.asInstanceOf[js.Any])
      
      inline def setPool_monthNull: Self = StObject.set(x, "pool_month", null)
      
      inline def setPool_year(value: String): Self = StObject.set(x, "pool_year", value.asInstanceOf[js.Any])
      
      inline def setPool_yearNull: Self = StObject.set(x, "pool_year", null)
      
      inline def setStaffQuestionmark(value: Boolean): Self = StObject.set(x, "staff?", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsual_first_name(value: String): Self = StObject.set(x, "usual_first_name", value.asInstanceOf[js.Any])
      
      inline def setUsual_first_nameNull: Self = StObject.set(x, "usual_first_name", null)
      
      inline def setUsual_full_name(value: String): Self = StObject.set(x, "usual_full_name", value.asInstanceOf[js.Any])
      
      inline def setUsual_full_nameNull: Self = StObject.set(x, "usual_full_name", null)
      
      inline def setWallet(value: Double): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    }
  }
}
