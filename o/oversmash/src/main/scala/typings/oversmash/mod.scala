package typings.oversmash

import org.scalablytyped.runtime.StringDictionary
import typings.oversmash.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oversmash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Options]
  inline def default(callerOptions: CallerOptions): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callerOptions.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  @js.native
  sealed trait NormalizeNamesAs extends StObject
  @JSImport("oversmash", "NormalizeNamesAs")
  @js.native
  object NormalizeNamesAs extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NormalizeNamesAs & String] = js.native
    
    @js.native
    sealed trait camel
      extends StObject
         with NormalizeNamesAs
    /* "camel" */ val camel: typings.oversmash.mod.NormalizeNamesAs.camel & String = js.native
    
    @js.native
    sealed trait snake
      extends StObject
         with NormalizeNamesAs
    /* "snake" */ val snake: typings.oversmash.mod.NormalizeNamesAs.snake & String = js.native
  }
  
  trait Account extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var level: Double
    
    var platform: String
    
    var portrait: String
    
    var public: Boolean
  }
  object Account {
    
    inline def apply(level: Double, platform: String, portrait: String, public: Boolean): Account = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    extension [Self <: Account](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait Achievement extends StObject {
    
    var achieved: Boolean
    
    var name: String
  }
  object Achievement {
    
    inline def apply(achieved: Boolean, name: String): Achievement = {
      val __obj = js.Dynamic.literal(achieved = achieved.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Achievement]
    }
    
    extension [Self <: Achievement](x: Self) {
      
      inline def setAchieved(value: Boolean): Self = StObject.set(x, "achieved", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallerOptions extends StObject {
    
    var defaultPlatform: String
    
    var normalizeNames: Boolean
    
    var normalizeNamesAs: NormalizeNamesAs
    
    var normalizeValues: Boolean
    
    var percentsToInts: Boolean
    
    var portraitUrlTemplate: String
    
    var requestOptions: RequestOptions
  }
  object CallerOptions {
    
    inline def apply(
      defaultPlatform: String,
      normalizeNames: Boolean,
      normalizeNamesAs: NormalizeNamesAs,
      normalizeValues: Boolean,
      percentsToInts: Boolean,
      portraitUrlTemplate: String,
      requestOptions: RequestOptions
    ): CallerOptions = {
      val __obj = js.Dynamic.literal(defaultPlatform = defaultPlatform.asInstanceOf[js.Any], normalizeNames = normalizeNames.asInstanceOf[js.Any], normalizeNamesAs = normalizeNamesAs.asInstanceOf[js.Any], normalizeValues = normalizeValues.asInstanceOf[js.Any], percentsToInts = percentsToInts.asInstanceOf[js.Any], portraitUrlTemplate = portraitUrlTemplate.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallerOptions]
    }
    
    extension [Self <: CallerOptions](x: Self) {
      
      inline def setDefaultPlatform(value: String): Self = StObject.set(x, "defaultPlatform", value.asInstanceOf[js.Any])
      
      inline def setNormalizeNames(value: Boolean): Self = StObject.set(x, "normalizeNames", value.asInstanceOf[js.Any])
      
      inline def setNormalizeNamesAs(value: NormalizeNamesAs): Self = StObject.set(x, "normalizeNamesAs", value.asInstanceOf[js.Any])
      
      inline def setNormalizeValues(value: Boolean): Self = StObject.set(x, "normalizeValues", value.asInstanceOf[js.Any])
      
      inline def setPercentsToInts(value: Boolean): Self = StObject.set(x, "percentsToInts", value.asInstanceOf[js.Any])
      
      inline def setPortraitUrlTemplate(value: String): Self = StObject.set(x, "portraitUrlTemplate", value.asInstanceOf[js.Any])
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompetitiveRank extends StObject {
    
    var damage: js.UndefOr[Double] = js.undefined
    
    var support: js.UndefOr[Double] = js.undefined
    
    var tank: js.UndefOr[Double] = js.undefined
  }
  object CompetitiveRank {
    
    inline def apply(): CompetitiveRank = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompetitiveRank]
    }
    
    extension [Self <: CompetitiveRank](x: Self) {
      
      inline def setDamage(value: Double): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
      
      inline def setDamageUndefined: Self = StObject.set(x, "damage", js.undefined)
      
      inline def setSupport(value: Double): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
      
      inline def setTank(value: Double): Self = StObject.set(x, "tank", value.asInstanceOf[js.Any])
      
      inline def setTankUndefined: Self = StObject.set(x, "tank", js.undefined)
    }
  }
  
  trait Game extends StObject {
    
    var gamesLost: Double
    
    var gamesPlayed: Double
    
    var gamesTied: Double
    
    var gamesWon: Double
    
    var games_lost: Double
    
    var games_played: Double
    
    var games_tied: Double
    
    var games_won: Double
    
    var timePlayed: String
    
    var time_played: String
  }
  object Game {
    
    inline def apply(
      gamesLost: Double,
      gamesPlayed: Double,
      gamesTied: Double,
      gamesWon: Double,
      games_lost: Double,
      games_played: Double,
      games_tied: Double,
      games_won: Double,
      timePlayed: String,
      time_played: String
    ): Game = {
      val __obj = js.Dynamic.literal(gamesLost = gamesLost.asInstanceOf[js.Any], gamesPlayed = gamesPlayed.asInstanceOf[js.Any], gamesTied = gamesTied.asInstanceOf[js.Any], gamesWon = gamesWon.asInstanceOf[js.Any], games_lost = games_lost.asInstanceOf[js.Any], games_played = games_played.asInstanceOf[js.Any], games_tied = games_tied.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], timePlayed = timePlayed.asInstanceOf[js.Any], time_played = time_played.asInstanceOf[js.Any])
      __obj.asInstanceOf[Game]
    }
    
    extension [Self <: Game](x: Self) {
      
      inline def setGamesLost(value: Double): Self = StObject.set(x, "gamesLost", value.asInstanceOf[js.Any])
      
      inline def setGamesPlayed(value: Double): Self = StObject.set(x, "gamesPlayed", value.asInstanceOf[js.Any])
      
      inline def setGamesTied(value: Double): Self = StObject.set(x, "gamesTied", value.asInstanceOf[js.Any])
      
      inline def setGamesWon(value: Double): Self = StObject.set(x, "gamesWon", value.asInstanceOf[js.Any])
      
      inline def setGames_lost(value: Double): Self = StObject.set(x, "games_lost", value.asInstanceOf[js.Any])
      
      inline def setGames_played(value: Double): Self = StObject.set(x, "games_played", value.asInstanceOf[js.Any])
      
      inline def setGames_tied(value: Double): Self = StObject.set(x, "games_tied", value.asInstanceOf[js.Any])
      
      inline def setGames_won(value: Double): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      inline def setTimePlayed(value: String): Self = StObject.set(x, "timePlayed", value.asInstanceOf[js.Any])
      
      inline def setTime_played(value: String): Self = StObject.set(x, "time_played", value.asInstanceOf[js.Any])
    }
  }
  
  type GameMode = StringDictionary[Hero]
  
  type Header = StringDictionary[String]
  
  trait Hero extends StObject {
    
    var assists: js.UndefOr[Statistic] = js.undefined
    
    var average: js.UndefOr[Statistic] = js.undefined
    
    var awards: js.UndefOr[Statistic] = js.undefined
    
    var best: js.UndefOr[Statistic] = js.undefined
    
    var combat: js.UndefOr[Statistic] = js.undefined
    
    var game: js.UndefOr[Game] = js.undefined
    
    var hero: js.UndefOr[Statistic] = js.undefined
    
    var misc: js.UndefOr[Statistic] = js.undefined
    
    var name: String
    
    var rawName: String
    
    var raw_name: String
  }
  object Hero {
    
    inline def apply(name: String, rawName: String, raw_name: String): Hero = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], raw_name = raw_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hero]
    }
    
    extension [Self <: Hero](x: Self) {
      
      inline def setAssists(value: Statistic): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      inline def setAssistsUndefined: Self = StObject.set(x, "assists", js.undefined)
      
      inline def setAverage(value: Statistic): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
      
      inline def setAwards(value: Statistic): Self = StObject.set(x, "awards", value.asInstanceOf[js.Any])
      
      inline def setAwardsUndefined: Self = StObject.set(x, "awards", js.undefined)
      
      inline def setBest(value: Statistic): Self = StObject.set(x, "best", value.asInstanceOf[js.Any])
      
      inline def setBestUndefined: Self = StObject.set(x, "best", js.undefined)
      
      inline def setCombat(value: Statistic): Self = StObject.set(x, "combat", value.asInstanceOf[js.Any])
      
      inline def setCombatUndefined: Self = StObject.set(x, "combat", js.undefined)
      
      inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
      
      inline def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
      
      inline def setHero(value: Statistic): Self = StObject.set(x, "hero", value.asInstanceOf[js.Any])
      
      inline def setHeroUndefined: Self = StObject.set(x, "hero", js.undefined)
      
      inline def setMisc(value: Statistic): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      inline def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      inline def setRaw_name(value: String): Self = StObject.set(x, "raw_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Player extends StObject {
    
    var accounts: js.Array[Account]
    
    var name: js.UndefOr[String] = js.undefined
    
    var nameEscaped: String
    
    var nameEscapedUrl: String
  }
  object Player {
    
    inline def apply(accounts: js.Array[Account], nameEscaped: String, nameEscapedUrl: String): Player = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], nameEscaped = nameEscaped.asInstanceOf[js.Any], nameEscapedUrl = nameEscapedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Player]
    }
    
    extension [Self <: Player](x: Self) {
      
      inline def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameEscaped(value: String): Self = StObject.set(x, "nameEscaped", value.asInstanceOf[js.Any])
      
      inline def setNameEscapedUrl(value: String): Self = StObject.set(x, "nameEscapedUrl", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait PlayerStats extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var nameEscaped: String
    
    var nameEscapedUrl: js.UndefOr[String] = js.undefined
    
    var platform: String
    
    var region: js.UndefOr[String] = js.undefined
    
    var stats: Stats
  }
  object PlayerStats {
    
    inline def apply(nameEscaped: String, platform: String, stats: Stats): PlayerStats = {
      val __obj = js.Dynamic.literal(nameEscaped = nameEscaped.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerStats]
    }
    
    extension [Self <: PlayerStats](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameEscaped(value: String): Self = StObject.set(x, "nameEscaped", value.asInstanceOf[js.Any])
      
      inline def setNameEscapedUrl(value: String): Self = StObject.set(x, "nameEscapedUrl", value.asInstanceOf[js.Any])
      
      inline def setNameEscapedUrlUndefined: Self = StObject.set(x, "nameEscapedUrl", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptions extends StObject {
    
    var baseURL: String
    
    var headers: Header
  }
  object RequestOptions {
    
    inline def apply(baseURL: String, headers: Header): RequestOptions = {
      val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type Statistic = StringDictionary[String | Double | Null]
  
  trait Stats extends StObject {
    
    var achievements: js.Array[Achievement]
    
    var competitive: GameMode
    
    var competitiveRank: CompetitiveRank
    
    var competitive_rank: CompetitiveRank
    
    var endorsementLevel: Double
    
    var endorsement_level: Double
    
    var gamesWon: Double
    
    var games_won: Double
    
    var quickplay: GameMode
  }
  object Stats {
    
    inline def apply(
      achievements: js.Array[Achievement],
      competitive: GameMode,
      competitiveRank: CompetitiveRank,
      competitive_rank: CompetitiveRank,
      endorsementLevel: Double,
      endorsement_level: Double,
      gamesWon: Double,
      games_won: Double,
      quickplay: GameMode
    ): Stats = {
      val __obj = js.Dynamic.literal(achievements = achievements.asInstanceOf[js.Any], competitive = competitive.asInstanceOf[js.Any], competitiveRank = competitiveRank.asInstanceOf[js.Any], competitive_rank = competitive_rank.asInstanceOf[js.Any], endorsementLevel = endorsementLevel.asInstanceOf[js.Any], endorsement_level = endorsement_level.asInstanceOf[js.Any], gamesWon = gamesWon.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAchievements(value: js.Array[Achievement]): Self = StObject.set(x, "achievements", value.asInstanceOf[js.Any])
      
      inline def setAchievementsVarargs(value: Achievement*): Self = StObject.set(x, "achievements", js.Array(value*))
      
      inline def setCompetitive(value: GameMode): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      inline def setCompetitiveRank(value: CompetitiveRank): Self = StObject.set(x, "competitiveRank", value.asInstanceOf[js.Any])
      
      inline def setCompetitive_rank(value: CompetitiveRank): Self = StObject.set(x, "competitive_rank", value.asInstanceOf[js.Any])
      
      inline def setEndorsementLevel(value: Double): Self = StObject.set(x, "endorsementLevel", value.asInstanceOf[js.Any])
      
      inline def setEndorsement_level(value: Double): Self = StObject.set(x, "endorsement_level", value.asInstanceOf[js.Any])
      
      inline def setGamesWon(value: Double): Self = StObject.set(x, "gamesWon", value.asInstanceOf[js.Any])
      
      inline def setGames_won(value: Double): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      inline def setQuickplay(value: GameMode): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
}
